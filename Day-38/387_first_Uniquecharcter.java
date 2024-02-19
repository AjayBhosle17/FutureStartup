class Demo{

	static int unique(String s){

		for(int i=0 ;i<s.length() ;i++){

			int cnt=0;
			for(int j=0 ;j<s.length() ;j++){

				//System.out.println(s.charAt(i) + " & " + s.charAt(j));
				if(s.charAt(i) == s.charAt(j)){


					cnt++;
				}else{

					if(cnt==2){

						break;
					}
				}
			}
			if(cnt==1){
				// System.out.println("hcbukb ");
				return i;
			}
		}
		return -1;
	}
	public static void main(String [] aargs){

		String s = "leetcode";
		int ch = unique(s);
		System.out.println(ch);
	}
}
