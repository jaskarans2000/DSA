// Infix evaluation

package Stacks_And_Queues;

import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        String expr="2+(5-3*6/2)";
        int val = infixEvaluation(expr);
        System.out.println(val);
    }

    public static int getPriority(char ch){
        if(ch=='(') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }

    public static int evaluate(int num1,int num2, char ch){
        if(ch=='+'){
            return num1+num2;
        }
        if(ch=='*'){
            return num1*num2;
        }
        if(ch=='/'){
            return num1/num2;
        }
        if(ch=='-'){
            return num1-num2;
        }
        return -1;
    }

    public static int infixEvaluation(String str){
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }else if(ch>='0' && ch<='9'){
                operand.push(ch-'0');
            }else{
                if(ch==')'){
                    //evaluate
                    while(operator.peek()!='('){
                        int num2=operand.pop();
                        int num1=operand.pop();
                        char operation=operator.pop();
                        int res=evaluate(num1,num2,operation);
                        operand.push(res);
                    }
                    operator.pop();
                }else if(operator.size()>0 && operator.peek()!='(' && getPriority(ch)<=getPriority(operator.peek())){
                    while(getPriority(ch)<getPriority(operator.peek())){
                        int num2=operand.pop();
                        int num1=operand.pop();
                        char operation=operator.pop();
                        int res=evaluate(num1,num2,operation);
                        operand.push(res);
                    }
                    operator.push(ch);
                }else{
                    operator.push(ch);
                }
            }
        }
        while (operator.size()>0) {
            int num2=operand.pop();
            int num1=operand.pop();
            char operation=operator.pop();
            int res=evaluate(num1,num2,operation);
            operand.push(res);
        }
        return operand.peek();
    }
}
