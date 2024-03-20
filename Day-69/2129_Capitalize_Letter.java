class Ajay{

	static String Capitalize(String title){

		
		StringBuffer sb=new StringBuffer();
		String arr[]=title.split(" ");

		for(int i=0 ;i<arr.length ;i++){
		
			String str=arr[i];
			
			if(str.length()<=2){
			
				sb.append(str.toLowerCase());
				
			}else{
			
				for(int j=0 ;j<str.length() ;j++){
				
					sb.append((j==0)?Character.toUpperCase(str.charAt(j)):Character.toLowerCase(str.charAt(j)));
				}

			}

			if(i!=arr.length-1){
			
				sb.append(" ");
			}
		}
			
		return sb.toString();
	}
	public static void main(String [] args){
	
		System.out.println(Capitalize(" i am Ajay bhosle"));
	}
}
