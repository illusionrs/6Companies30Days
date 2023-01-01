import java.util.Stack;

/**
 * Question Link:
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 */

public class MicroSoft_1 {


        public int evalRPN(String[] tokens) {
            Stack<String> stack = new Stack<>();

            for(int i=0;i<tokens.length;i++){
                if(tokens[i].equals("/") || tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")){
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    int calc = calc(a,b,tokens[i]);
                    stack.push(""+calc);
                }else{
                    stack.push(tokens[i]);
                }
            }
            return Integer.parseInt(stack.pop());
        }

        public int calc(int a, int b, String oprt){

            if("/".equals(oprt)){
                return b/a;
            }
            else if("+".equals(oprt))
                return a+b;
            else if("-".equals(oprt)){
                return b-a;
            }else{
                return b*a;
            }
        }

}
