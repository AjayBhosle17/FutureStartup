import java.util.*;
class Ajay{

	static int [] product(int nums[]){
	
		int flag=0;
		int product=1;
		for(int i=0 ;i<nums.length ;i++){
		
			if(nums[i]==0){
				
				flag++;
				continue;
			}
			product*=nums[i];

		}

		if(flag>1){
			
			product=0;
		}

		for(int i=0 ;i<nums.length;i++){
		
			if(nums[i]==0){
			
				nums[i]=product;
			}else if(flag==0){
			
				nums[i]=product/nums[i];
			}else{
			
				nums[i]=0;
			}
		}
		
		return nums;

	}
	public static void main(String [] args){
	
		int arr[]={0,2,0};

		int arr1[]=product(arr);

		System.out.println(Arrays.toString(arr1));

	}
}
