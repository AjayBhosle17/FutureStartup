import java.util.*;
class Solution {
    static int[] sortedSquares(int[] nums) {
       


       int temp[]= new int[nums.length];

       for(int i=0 ;i<nums.length ;i++){

	       temp[i]= nums[i]*nums[i];
	      // System.out.println(temp1[i]);
       }
       Arrays.sort(temp);

       return teiiimp; 
    }

    public static void main(String [] args){

	    int arr[]= {-4,-1,0,3,10};
	    int arr1[]=sortedSquares(arr);
	    System.out.println(Arrays.toString(arr1));
    }
}
