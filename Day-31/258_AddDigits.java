class Demo{

	static int addstr(int x){

	
		if(num%9==0 && num!=0){

            
			return 9;
       
		}
		num=num%9;
		return num;

	}
	public static void main(String [] args){

		int y=38;
		int x =addstr(y);
		System.out.println(x);
	}
}
