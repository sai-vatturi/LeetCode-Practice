class Solution {
    public boolean isValid(String s) {
        // Stack Question

        // Use a stack and push opening brackets directly
        // if it a closing bracket, check if top is similar opening bracket
        // if true, then pop, else push the closing bracket
        // in the end, check true stack is empty() else return false

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if ((!(stack.isEmpty()) && bracket == ')' && stack.peek() == '(') ||
                    (!(stack.isEmpty()) && bracket == ']' && stack.peek() == '[') ||
                    (!(stack.isEmpty()) && bracket == '}' && stack.peek() == '{') ) {
                        stack.pop();
                    }
                else {
                    stack.push(bracket);
                }
            }
        }

        return stack.isEmpty();
    }
}