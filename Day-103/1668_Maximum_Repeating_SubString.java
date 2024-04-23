class Ajay {

	static int maxRepea(String sequence , String word){
		int max=0;
		
		for(int i=0 ;i<=sequence.length()-word.length();i++){
			int k=0;
			for(int j=0 ;j<word.length() ;j++){
			
				if(sequence.charAt(i+j)==word.charAt(j)){
				
					k++;
				}else{
				
					break;
				}
			}
			
			
			if(k==word.length()){
							
				max++;
			}

		}

		return max;

	}
	public static void main(String [] args){
	
		System.out.println("test case -1");
		System.out.println(maxRepea("ababc","ab"));
		
		System.out.println("test case -2");
		System.out.println(maxRepea("ababc","ba"));
		
		System.out.println("test case -3");
		System.out.println(maxRepea("ababc","ac"));
		
		System.out.println("test case -4");
		System.out.println(maxRepea("aaa","a"));
	}
}
