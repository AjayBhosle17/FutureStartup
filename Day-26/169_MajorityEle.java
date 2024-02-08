import java.util.*;
class Solution {
    static int majorityElement(int[] nums) {
        
	    int x=0;
	    for(int i=0 ;i<nums.length ;i++){


		    int count=0;
		    for(int j=0 ;j<nums.length ;j++){

			    if(nums[i]==nums[j]){

				    count++;

				    if(nums.length/2 < count){

					    x=i;
					    break;
				    }
			    }

		    }
	    }
	    return nums[x];
        
    }

    public static void main(String [] args){

	    int arr[]={6,5,5};
	    int arr1=majorityElement(arr);

	    System.out.println(arr1);
    }
}
