import java.util.*;
class Demo{

	static int unique(int nums[] ){

		HashMap <Integer,Integer> hm = new HashMap<>();

		for(int i: nums ){

			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		int sum=0;

		for(int i:hm.keySet()){

			if(hm.get(i)==1){

				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String [] args){

		int arr[]={1,2,5,3};
		int sum=unique(arr);
		System.out.println(sum);
	}
}
