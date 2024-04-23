import java.util.*;

class Ajay{

	static int[] Arr(int nums[]){
		
		int arr[]=new int[nums.length];
		int k=0;

		
		int start=0;
		int end=1;
		for(int i=0 ;i<nums.length ;i++){
		

			if(nums[i]%2==0){
			
				arr[start]=nums[i];
				start+=2;
				

			}else{
			
				arr[end]=nums[i];
				end+=2;
			}

			
		}

		

		return arr;
			
	}

	public static void main(String [] args){
	
		int arr[]={4,2,5,7};

		System.out.println(Arrays.toString(Arr(arr)));

	}
}
