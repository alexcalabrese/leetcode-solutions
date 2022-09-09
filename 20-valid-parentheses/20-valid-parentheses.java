class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        if(s.length() == 0) return false;

        for(int i = 0; i < s.length(); i++){            
            char curr = s.toCharArray()[i];
            
            if(curr == '(' || curr == '[' || curr == '{'){
                stack.push(curr);
            } else if(curr == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
            } else if(curr == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
            } else if(curr == '}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
            } else {
                stack.push(curr);
            }
        }
        
        return stack.isEmpty();
    }
}