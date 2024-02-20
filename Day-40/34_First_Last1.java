import java.util.*;
class Solution{

	static int[] searchRange(int[] nums, int target) {


		int arr[]=new int[]{-1,-1};
		

		if(nums.length==0){

			return arr;
		}
		int start=0 , end =nums.length-1;

		while(start<end){

			int mid=start+(end-start)/2;

			if(nums[mid]>=target){

				end=mid;
			}else{

				start=mid+1;
			}
		}

		System.out.println(nums[start]);
		if(nums[start]!=target){

			return arr;
		}

		arr[0]=start;
		end= nums.length-1;

		while(start<end){

			int mid=start+(end-start)/2;

			if(nums[mid] > target){

				end=mid;
			}else{
				start=mid+1;
			}
		}
		arr[1]=start-1;
		return arr;
	}

	public static void main(String[] args){

		int arr[]={1,1};
		int arr1[]=searchRange(arr,3);

		System.out.println(Arrays.toString(arr1));
	}
}

