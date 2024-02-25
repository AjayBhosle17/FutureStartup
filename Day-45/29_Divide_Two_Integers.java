class Demo{

	static int divisor1(int dividend , int divisor){


        	if(dividend==-2147483648  && divisor==-1){

            		return 2147483647;
		}
		
		return  dividend/divisor;

	}
	public static void main(String [] args){

		int dividend=7;
		int divisor=-2;

		int div=divisor1(dividend,divisor);

		System.out.println(div);
	}
}
