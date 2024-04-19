import java.util.*;
class Ajay{

	static int repeatedNtimes(int nums[]){
	
		List<Integer>ls=new ArrayList<>();
		
		for(int i: nums){
		
			if(ls.contains(i)){
			
				return i;
			}else{
			
				ls.add(i);
			}
		}

		return -1;
	}

	public static void main(String [] args){
	
		int nums[]={1,3,3,3};
		System.out.println(repeatedNtimes(nums));
	}
}
