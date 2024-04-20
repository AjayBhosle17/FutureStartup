import java.util.*;
class Ajay{

	static int[] nextGreater(int nums1[],int nums2[]){
		
		for(int i=0 ; i<nums1.length ; i++){
            boolean find = false;
            int max=nums1[i];
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i]==nums2[j])find=true;
                if(find && nums2[j]>max){
                    max=nums2[j];
                    break;
                }
            }
            if(max==nums1[i])nums1[i]=-1;
            else nums1[i]=max;
        }
        return nums1;

	}

	public static void main(String [] args){
		
		int arr[]={4,1,2};
		int arr1[]={1,3,4,2};

		System.out.println(Arrays.toString(nextGreater(arr,arr1)));

	}
}
