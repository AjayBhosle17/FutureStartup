import java.util.*;

class Ajay{

	static boolean uniqueOcc(int[] arr) {
        
		HashMap <Integer,Integer> hm=new HashMap<>();
		Set<Integer>hs=new HashSet<>();


		for(int i:arr){
		
			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		
		
		for(int i:hm.values()){
		

			if(hs.contains(i)){
			
				return false;

			}
			hs.add(i);
			
		}
		
		return true;
    	}

	public static void main(String [] args){
	
		int arr[]={1,2,2};

		System.out.println(uniqueOcc(arr));

	}
}
