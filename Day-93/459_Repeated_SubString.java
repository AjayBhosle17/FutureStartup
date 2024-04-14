class Ajay {
   
       	static boolean repeatedSubstringPattern(String s) {
  
	
		String s1=s+s;

		String sub=s1.substring(1,s1.length()-1);

		return sub.contains(s);
    	}
	public static void main(String [] args){
	
		String s="Ajay";
		
		System.out.println(repeatedSubstringPattern(s));
	}
}
