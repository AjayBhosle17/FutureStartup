

import java.util.*;
class Demo{

	static int dupli(int nums[]){

		HashMap<Integer,Integer>hm=new HashMap<>();

		for(int i: nums){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		for(int i:hm.keySet()){
		
			if(hm.get(i)>=2){


				return i;
			}
		}
		return -1;
	}

	public static void main(String [] args){

		int nums[] = {3,2,4,5,2};

		int duplicate=dupli(nums);
		System.out.println(duplicate);
	}
}

