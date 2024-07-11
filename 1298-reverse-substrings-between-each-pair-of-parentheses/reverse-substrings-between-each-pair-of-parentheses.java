class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder(""));
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(new StringBuilder(""));
            }
            else if(ch == ')'){
                stack.peek().reverse();
                StringBuilder sb1 = stack.pop();
                if(!stack.isEmpty())
                    stack.peek().append(sb1);
            }
            else{
                if(!stack.isEmpty()){
                    stack.peek().append(ch);
                }
            }
        } 
        return stack.pop().toString();
    }
}