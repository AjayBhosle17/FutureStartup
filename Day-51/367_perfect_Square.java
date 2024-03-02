class Ajay{

	static boolean square(int num){

		if(num==1){

            return true;
        }
        for(int i=1 ;i<=num/2;i++){

			 if(num==i*i){

				 return true;
			 }

			 if(num < i*i){

				 return false;
			 }
		 }
		 return false;

	}

	public static void main(String [] args){

		int num=14;

		boolean perfect=square(num);
		System.out.println(perfect);
	}
}
