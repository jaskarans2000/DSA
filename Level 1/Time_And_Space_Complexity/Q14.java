// Target Sum pair

package Time_And_Space_Complexity;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{9, -48, 100, 43, 84, 74, 86, 34, -37};
        int target=160;
        Arrays.sort(myArray1);
        int i=0,j=myArray1.length-1;
        while(i<j){
            if(myArray1[i]+myArray1[j]==target){
                System.out.println(myArray1[i]+"+"+myArray1[j]+"="+target);
                i++;
                j--;
            }else if(myArray1[i]+myArray1[j]<target){
                i++;
            }else{
                j--;
            }
        }
    }
}
