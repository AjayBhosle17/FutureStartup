class Future{

	static char Diff(String str , String str1){

		int add=0;
		int add1=0;
		for(int i=0 ;i <str.length() ;i++){
		
			add=add+str.charAt(i);
		}
		
		for(int i=0 ;i <str1.length() ;i++){
		
			add1=add1+str1.charAt(i);
		}

		return (char)(add1-add);
		
	}

	public static void main(String [] args){


		String str="Ajay";
		String str1="AjayB";

		char diff1 = Diff(str,str1);

		System.out.println(diff1);
	}
}
