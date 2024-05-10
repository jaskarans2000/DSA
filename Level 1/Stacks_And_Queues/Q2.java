// balanced brackets
// [(a+b)+{(c+d)*(e/f)}] -> true
// [(a+b)+{(c+d)*(e/f)]} -> false

package Stacks_And_Queues;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        String str="[(a+b)+{(c+d)*(e/f)]}";
        System.out.println(hasBalancedBrackets(str));
    }

    public static boolean hasBalancedBrackets(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                st.push(str.charAt(i));
            }else if(st.size()==0 || str.charAt(i)==')'){
                if(st.peek()!='('){
                    return false;
                }
                st.pop();
            }else if(str.charAt(i)==']'){
                if(st.size()==0 || st.peek()!='['){
                    return false;
                }
                st.pop();
            }else if(st.size()==0 || str.charAt(i)=='}'){
                if(st.peek()!='{'){
                    return false;
                }
                st.pop();
            }else{
                continue;
            }
        }
        return st.size()>0?false:true;
    }
}
