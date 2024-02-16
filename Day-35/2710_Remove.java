import java.util.*; 
class Demo{

	static String remove(String str){

		StringBuffer sb = new StringBuffer();
		char arr[]=str.toCharArray();

		int temp=0;
		for(int i=arr.length-1 ;i >=0 ;i--){

			temp=i;
			if(arr[i]!='0'){

				break;
			}else{

				temp=i;
			}
		}
		for(int i=0 ; i<=temp;i++){

			sb.append(arr[i]);
		}

		return sb.toString();
	}
	public static void main(String [] args){

		String str = "120300";
		String str2 = remove(str);
		System.out.println(str2);
	}
}
