class Ajay{

	static int fibo(int n){
	
		if(n==0){
		
			return 0;
		}
		if(n==1){
		
			return 1;
		}
		int a=0;
		int b =1;
		int c=0;
		for(int i=1;i<n;i++){
		
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

	public static void main(String [] args){
	

		System.out.println(fibo(4));
	}
}
