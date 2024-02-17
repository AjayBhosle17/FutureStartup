class Demo {

	static boolean valid(String s){

		s=s.toLowerCase();
		StringBuffer sb = new StringBuffer();
			  for(int i=0 ;i<s.length() ;i++){

					  if(((s.charAt(i)>=97 && s.charAt(i)<=122 )|| (s.charAt(i)>=48 && s.charAt(i)<=57) )){

							  sb.append(s.charAt(i));
					  }
			  }


			  String s1= sb.toString();
			  int start=0;
			  int end=s1.length()-1;

			  char arr[] = s1.toCharArray();
			  while(start<end){

					  if(arr[start]!=arr[end]){

							  return false;
					  }
					  start++;
					  end--;
			  }
			  return true; 
	}
	public static void main(String [] args){

		String str = " ";
		boolean valid1 =valid(str);
		System.out.println(valid1);
	}
}
