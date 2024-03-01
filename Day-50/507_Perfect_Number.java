
class Ajay{

	static boolean perfect(int num){

		int sum=0;
		for(int i=1;i<=num/2;i++){
			
			if(num%i==0){

				sum+=i;
			}
		}
			
			
		if(sum==num){

		
			return true;
				
		}
		return false;
	}
	public static void main(String [] args){

		int num=2016;
		boolean perfectnum=perfect(num);
		System.out.println(perfectnum);
	}
}
