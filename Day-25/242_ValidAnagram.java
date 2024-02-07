import java.util.*;
class Demo{

	static boolean anagra(String str1 , String str2){

		if(str1.length() !=str2.length()){

			return false;
		}

		char arr[]= str1.toCharArray();
		char arr1[]= str2.toCharArray();

		Arrays.sort(arr);
		Arrays.sort(arr1);

		int flag=0;
		for(int i=0 ; i<arr.length ;i++){

			if(arr[i]!=arr1[i]){

				flag=1;
				break;
			}
		}

		if(flag==1){

			return false;
		}
		return true;
	}
	public static void main(String [] args){

		String str = "anagram";
		String str1 = "nagaram";

		boolean x = anagra(str,str1);
		System.out.println(x);
	}
}
