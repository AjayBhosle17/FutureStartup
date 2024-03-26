class Ajay {
   
       	static boolean isSubsequence(String s, String t) {
        
		int i=0;
		int j=0;

		if(s.length()==0){
		
			return true;
		
		}
		while(i<s.length() && j<t.length()){
		
			if(s.charAt(i)==t.charAt(j)){
			
				i++;
				j++;
			}else{
			
				j++;
			}
		}
		if(i==s.length()){
		
			return true;
		}
		return false;

    	}

	public static void main(String [] args){
	
		System.out.println(isSubsequence("asb","ajaybse"));
	}
}
