import java.util.*;
class Ajay{

	static boolean wordPatteren(String pattern , String s){
	
		String arr1[]=s.split("\\s");

		if(pattern.length()!=arr1.length){
		
			return false;
		}

		Map<Character, String> hm=new HashMap<>();
		Map<String, Character> hm1=new HashMap<>();

		for(int i=0 ;i<pattern.length() ;i++){
		
			char c=pattern.charAt(i);
			String str=arr1[i];

			if(hm.containsKey(c)){
			
				if(!hm.get(c).equals(str)){
				
					return false;
				}
			}else{
			
				if(hm1.containsKey(str)){
				
					return false;
				}

				hm.put(c,str);
				hm1.put(str,c);
			}
		}
		return true;
	}

	public static void main(String [] args){
	
		String pattern="abba";
		String s="dog dog dog dog";
		System.out.println(wordPatteren(pattern,s));
	}
}
