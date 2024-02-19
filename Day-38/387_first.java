import java.util.*;
class Demo{

	static int unique(String s){

		HashMap <Character,Integer> hm=new HashMap<>();

		for(char ch:s.toCharArray()){

			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		
		for(int i=0 ;i<s.length() ;i++){

			if(hm.get(s.charAt(i))==1){

				return i;
			}
		}
		return -1;
	}
	public static void main(String [] aargs){

		String s = "aay";
		int ch = unique(s);
		System.out.println(ch);
	}
}
