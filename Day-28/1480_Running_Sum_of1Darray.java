import java.util.*;

class Solution {
    static int[] runningSum(int[] nums) {
        
        int sum=0;
        for(int i=0 ;i<nums.length ;i++){

            sum=sum+ nums[i];
            nums[i]=sum;
        }
        return nums;
    }

    public static void main(String [] args){

	    int arr[] = {1,2,3,4};
	    int arr1[]= runningSum(arr);

	    System.out.println(Arrays.toString(arr1));
    }
}
