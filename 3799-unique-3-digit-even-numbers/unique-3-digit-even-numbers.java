class Solution {
    public int totalNumbers(int[] digits) {
        // Create a frequency map to count occurrences of each digit (0-9)
        int[] digitCount = new int[10];
        for (int digit : digits) {
            digitCount[digit]++;
        }
        
        int validNumbersCount = 0;
        
        // Loop through all possible 3-digit even numbers
        for (int i = 100; i <= 998; i += 2) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = i / 100;
            
            // Temporarily use the digits required to form the current number 'i'
            digitCount[ones]--;
            digitCount[tens]--;
            digitCount[hundreds]--;
            
            // Check if we had enough of each digit to form this number
            if (digitCount[ones] >= 0 && digitCount[tens] >= 0 && digitCount[hundreds] >= 0) {
                validNumbersCount++;
            }
            
            // Backtrack: restore the counts for the next iteration
            digitCount[ones]++;
            digitCount[tens]++;
            digitCount[hundreds]++;
        }
        
        return validNumbersCount;
    }
}