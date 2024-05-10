// Q. Duplicate brackets
// expression is balanced
// ((a+b)+(c+d))->false
// (a+b)+((c+d))->true

package Stacks_And_Queues;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        String str="( a + b ) + ( ( c + d ) )";
        System.out.println(checkDuplicateBrackets(str));
    }
    
    public static boolean checkDuplicateBrackets(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }else if(str.charAt(i)==')'){
                if(st.peek()=='('){
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        return false;
    }
}
