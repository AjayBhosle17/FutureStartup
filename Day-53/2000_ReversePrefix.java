import java.util.*;
class Ajay{

	static String Reverse(String word , char ch){

		char arr[]=word.toCharArray();

		int start=0;
		int flag=0;
		for(int i=0 ;i<arr.length;i++){

			if(ch==arr[i]){
			
				System.out.println(ch);
				start=i;
				System.out.println(start);
				flag=1;
				break;	
			}
		}
		if(flag==0){

			return word;
		}
		int k=start;
		for (int i = 0; i <= start / 2; i++) {
        		char temp = arr[i];
        		arr[i] = arr[k];
       			arr[k] = temp;
        		k--;
		}
		return new String(arr);

	}
	public static void main(String [] args){

		String str="ajay";
		String str1=Reverse(str,'w');
		System.out.println(str1);

	}
}
