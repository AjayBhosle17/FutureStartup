
class  Demo {

	static String palind(String[] str){


		for(int i=0 ;i<str.length;i++){

			char arr[]=str[i].toCharArray();

			int start=0;
			int end=arr.length-1;
			int flag=0;
			while(start<end){

				if(arr[start]!=arr[end]){

					flag=1;
					break;
				}
				start++;
				end--;
			}
			if(flag==0){

				return new String(arr);
			}
		}
		return "";
	}
	public static void main(String [] args){

		String str[]={"abc" , "abi","bai"};
	

		String str1=palind(str);

		System.out.println(str1);
	}
}
