class Demo{

	static int secondLargest(String str){

		int max1=-1;
		int max2=-1;
		for(int i=0 ;i<str.length();i++){

			if(Character.isDigit(str.charAt(i))){

				int num=Character.getNumericValue(str.charAt(i));

				if(num>max1){

					max2=max1;
					max1=num;
				
				} else if(max1!=num && num>max2){

					max2=num;
				}
			}
		}

		return max2;
	}

	public static void main(String [] args){

		String str="aja31y233";
		int num=secondLargest(str);
		System.out.println(num);
	}
}
