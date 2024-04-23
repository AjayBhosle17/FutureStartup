class Ajay {

	static int maxRepea(String sequence , String word){
		int max=0;
		
		String add=word;
		while(sequence.contains(word)==true){
		
			max++;
			word+=add;

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
