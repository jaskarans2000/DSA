// Next smaller to right
// [2,5,9,3,1,12,6,8,7]
// [1,3,3,1,-1,6,-1,7,-1]

package Stacks_And_Queues;

import java.util.Arrays;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,9,3,1,12,6,8,7};
        int[] res=nsr(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] nsr(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                res[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0) {
            res[st.peek()]=-1;
            st.pop();
        }
        return res;
    }
}
