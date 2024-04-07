import java.util.*;
class Ajay {
    
	static String sortVowels(String s) {
        
		LinkedList<Character> ls=new LinkedList<>();
		int flag=0;		
		char arr[]=s.toCharArray();
		for(char i:s.toCharArray()){
		
			if(isVowel(i)){
				flag=1;	
				ls.add(i);
				
			}
		}
		if(flag==0){
		
			return s;
		}
		Collections.sort(ls);	
		
		int k=0;
		for(int i=0;i<arr.length;i++){
		
			if(isVowel(arr[i])){
			
				arr[i]=ls.get(k);
				k++;
			}
		}		

		
    		return new String(arr);
	}
	static boolean isVowel(char c){
	
		return "aeiouAEIOU".indexOf(c)!=-1;
	}

	public static void main(String [] args){
	
		System.out.println(sortVowels("lEetcOde"));
		System.out.println(sortVowels("Ajay"));

	}
}
