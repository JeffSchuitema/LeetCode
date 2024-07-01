//We can brute force this by searching every s.char[i] iterating s.char[i++] until a duplicate is found, and recording the results. This yeilds N^2 or N^3 or something silly
//We can save processing power by using a sliding window search. Each character is only processed 2x when it enters and exits the window.

class Solution {
    static final int NO_OF_CHARS = 256;
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int result = 0;
        int[] lastIndex = new int[NO_OF_CHARS];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        for (int j = 0; j < l; j++) {
            i = Math.max(i, lastIndex[s.charAt(j)] + 1);
            result = Math.max(result, j - i + 1);
            lastIndex[s.charAt(j)] = j;
        }
        return result;
    }
}
