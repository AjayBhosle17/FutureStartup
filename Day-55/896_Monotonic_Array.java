
class Demo{

	static boolean monotonic(int []nums){

		int end=nums.length-1;
		int i=0;
		for(i=0 ;i<nums.length-1 ;i++){

			if(nums[i]<=nums[i+1]){

				continue;
			}else{

				break;
			}
		}
		if(i==nums.length-1){

			return true;
		}
		
		for(i=0 ;i<nums.length-1 ;i++){

			if(nums[i+1]<=nums[i]){

				continue;
			}else{

				break;
			}
		}
		if(i==nums.length-1){

			return true;
		}
		return false;
		
	}
	public static void main(String [] args){

		int arr[]={1,2};
		boolean mono=monotonic(arr);
		System.out.println(mono);
	}
}
