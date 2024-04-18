class Ajay {

	static boolean isPower(int n){
	
		if(n<=0){
		
			return false;
		}

		while(n>1){
		
			if(n%3!=0){
			
				return false;
			}
			n/=3;
		}
		return true;
	}

	public static void main(String [] args){
	
		System.out.println(isPower(6));

	}
}
