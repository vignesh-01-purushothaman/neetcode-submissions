class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                if(stack.size() >= 2){
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    if(str.equals("+")){
                        stack.push(Integer.toString(num2 + num1));
                    }
                    else if(str.equals("-")){
                        stack.push(Integer.toString(num2 - num1));
                    }
                    else if(str.equals("*")){
                        stack.push(Integer.toString(num2 * num1));
                    }
                    else{
                        stack.push(Integer.toString(num2 / num1));
                    }
                }
            }
            else{
                stack.push(str);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}