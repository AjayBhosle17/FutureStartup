
import java.util.*;
class Ajay{

	static int[] interSection(int []nums1,int []nums2){
	
		HashSet<Integer>hs=new HashSet<>();
		HashSet<Integer>hs1=new HashSet<>();
		
		for(int i:nums1){
		
			hs.add(i);
		}

		for(int i:nums2){
		
			hs1.add(i);
		}

		hs.retainAll(hs1);
		int arr[]=new int[hs.size()];
		int index=0;
		for(int i:hs){
		
			arr[index++]=i;
		}
		return arr;

	
	}

	public static void main(String [] args){
	
		int arr[]={1,2,3};
		int arr1[]={1,1,2,4};
		System.out.println(Arrays.toString(interSection(arr,arr1)));

	}
}
