class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long shiftSum = 0; // Use long to prevent overflow before applying modulo
        
        // Iterate backwards to calculate the cumulative shift for each character
        for (int i = shifts.length - 1; i >= 0; i--) {
            shiftSum = (shiftSum + shifts[i]) % 26;
            
            // Shift the current character and wrap around using modulo 26
            chars[i] = (char) ((chars[i] - 'a' + shiftSum) % 26 + 'a');
        }
        
        return new String(chars);
    }
}