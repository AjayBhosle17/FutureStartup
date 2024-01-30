class Demo {

	static int revers(int num){
		
		int rev=0;
		while(num!=0 && num!=Integer.MAX_VALUE){
		
			if(rev < Integer.MIN_VALUE/10 || rev> Integer.MAX_VALUE/10){

             		   return 0;
           		}
			
			rev=rev*10 + num%10;
			num/=10;

		}
		return rev;

	}
	public static void main(String [] args){


		int num =120;
		
		int x= revers(num);
		System.out.println(x);
	}
}
