// sliding window maximum

package Stacks_And_Queues;

import java.util.Arrays;
import java.util.Stack;

public class Q7 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k=4;
        slidingWindow(arr,k);
    }

    public static void slidingWindow(int[] arr, int k){
        int[] ngr=ngr(arr);
        int windowGreater=0;
        for(int i=0;i<arr.length-k+1;i++){
            if(windowGreater<i){
                windowGreater=i;
            }
            while(ngr[windowGreater]<i+k){
                windowGreater=ngr[windowGreater];
            }
            System.out.println(arr[windowGreater]);
        }
    }

    public static int[] ngr(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                res[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0) {
            res[st.peek()]=arr.length;
            st.pop();
        }
        return res;
    }
    
}
