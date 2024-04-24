import java.util.*;
class Ajay {
	
	static int[] SingleNumber(int arr[]){
	
		Map <Integer,Integer>hm=new HashMap<>();
		ArrayList <Integer> ls = new ArrayList<>();
		for(int num:arr){
		
			hm.put(num,hm.getOrDefault(num,0)+1);
		}

		for(int i:hm.keySet()){
		
			if(hm.get(i)==1){
				
				ls.add(i);
			}
		}

		
		int arr1[]=new int[ls.size()];
		for(int i=0 ;i<ls.size() ;i++){
		
			arr1[i]=ls.get(i);
		}

	//	System.out.println(Arrays.toString(arr1));
		return arr1;

	}
	public static void main(String [] args){
	
		int nums[] = {1,2,1,3,2,5};

		System.out.println(Arrays.toString(SingleNumber(nums)));
		
		int nums1[] = {-1,0};

		System.out.println(Arrays.toString(SingleNumber(nums1)));
	}
}
