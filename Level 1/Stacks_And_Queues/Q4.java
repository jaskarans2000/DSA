// Next greater element to the left
// [2,5,9,3,1,12,6,8,7]
// [-1,-1,-1,9,3,-1,12,12,8]

package Stacks_And_Queues;

import java.util.Arrays;
import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,9,3,1,12,6,8,7};
        int[] res=ngl(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] ngl(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
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
