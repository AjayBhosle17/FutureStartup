import java.util.*;
class Solution {
	
	static int singleNumber(int[] nums) {

		Map<Integer,Integer>hm=new  HashMap<>();

		for(int i:nums){
		
			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
		
			if(entry.getValue()==1){
			
			
				return entry.getKey();
			}
		}
		return -1;

	}

	public static void main(String [] args){
	
		int arr[]={2,2,3,2};
		System.out.println(singleNumber(arr));

	}
}

