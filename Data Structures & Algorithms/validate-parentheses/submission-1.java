

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                // If stack is empty -> no matching opening bracket
                if (stack.isEmpty()) return false;

                char top = stack.peek();

                // Check if current closing bracket matches the top opening bracket
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }

                // Pop the matched opening bracket
                stack.pop();
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
