import java.util.*;

class Future{

	static int[] Minimum(int nums[]){

		int arr[] =new int[nums.length];
		Arrays.sort(nums);
		int bob=0;
		int Alice=1;
		for(int i=1 ;i<nums.length ;i+=2){

			arr[bob]=nums[i];
			bob+=2;
		}
		
		for(int i=0 ;i<nums.length ;i+=2){

			arr[Alice]=nums[i];
			Alice+=2;
		}
		return arr;

	}
	public static void main(String [] args){

		int arr[] ={5,4,2,3};

		int arr1[] = Minimum(arr);

		System.out.println(Arrays.toString(arr1));
		
	}
}
