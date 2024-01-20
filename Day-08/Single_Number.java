import java.util.*;
class Solution {
    
    static int singleNumber(int arr[]){

        int sum=0;
        for(int i=0; i<arr.length; i++){
             

            sum = sum ^arr[i];
        }
        return sum;
    }

    public static void main(String[] args){

        int test_case1[] = new int[] {2,2,1};
        int test_case2[] = new int[] {4,1,2,1,2};
        int test_case3[] = new int[] {1};

        int output1 = singleNumber(test_case1);
        int output2= singleNumber(test_case2);
        int output3= singleNumber(test_case3);

        System.out.println(Arrays.toString(test_case1) + " Output is "+output1);
        System.out.println(Arrays.toString(test_case2) + " Output is "+output2);
        System.out.println(Arrays.toString(test_case3) + " Output is "+output3);
    }
}
    

