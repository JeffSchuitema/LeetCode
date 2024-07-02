//O(N) It aint pretty, but it works. If the prompt didnt explicitly say "dont use 64 bit/longs"
// then just use a long next time
class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x = x * (-1);
        }
      
        if (x == 0) {
            return 0;
        }
      
        String s = Integer.toString(x);
        Stack<Character> stack = new Stack<>();
      
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
      
        String temp = "";
      
        while (!stack.isEmpty()) {
            temp += stack.pop();
        }
      
        try {
            int y = Integer.parseInt(temp);
        } catch (Exception e) {
            return 0;
        }
      
        int y = Integer.parseInt(temp);
      
        if (isNeg) {
            y = y * (-1);
        }
      
        return y;
    }
}
