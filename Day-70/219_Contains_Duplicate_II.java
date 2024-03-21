import java.util.*;
class Ajay {

    	static boolean containsNearbyDuplicate(int[] nums, int k) {
       

		HashMap<Integer,Integer>hm=new HashMap<>();

		for(int i=0 ;i<nums.length ;i++){
		
			if(hm.containsKey(nums[i])){
			
				int index=hm.get(nums[i]);

				if(i-index<=k){
				
					return true;
				}else{
				
					hm.put(nums[i],i);
				}


			}else{
			
				hm.put(nums[i],i);

			}
		
		}
		return false;
	}

	public static void main(String [] args){
	
		int arr[]={1,2,3,1};
		int k=3;
		System.out.println(containsNearbyDuplicate(arr,k));
        
	}
}
