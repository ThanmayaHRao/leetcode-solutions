class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(!s.equals("/")&&!s.equals("+")&&!s.equals("-")&& !s.equals("*")){
                    int num = Integer.parseInt(s);
            if(num >= -200  &&  num <= 200){
                stack.push(num);
            }
            }
            
            else{
               int b=stack.pop();
                int a= stack.pop();
                            switch (s) {
                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;
                }

            }
        }
        return stack.peek();
    }
}