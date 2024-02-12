
//import.java.util.*;
import java.util.*;
class Demo{

	static int[]  moveZero(int nums[]){

		int k=0;
        for(int i=0 ;i<nums.length ;i++){

                if(nums[i]!=0){

                    int temp = nums[k];
                    nums[k]=nums[i];
                    nums[i]=temp;

                    k++;
                }
        }
		return nums;

	}
	public static void main(String [] args){


		int arr[]= {0,1,0,5,4,2,2};
		int arr1[]=moveZero(arr);
		System.out.println(Arrays.toString(arr1));

	}
}
