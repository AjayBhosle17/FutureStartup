

class Solution{

	static int major(int nums[]){


		int count=0;
		int stud=0;
		for(int i=0 ;i<nums.length ;i++){

			if(count==0){

				stud=nums[i];
			}

			if(stud==nums[i]){

				count++;
			}else{
				
				count--;
			}
		}
		return stud;
	}

	public static void main(String [] args){


		int arr[]={3,2,3};

		int major1= major(arr);
		System.out.println(major1);
	}
}
