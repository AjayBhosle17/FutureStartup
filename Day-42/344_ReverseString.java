import java.util.*;

class Demo{


	static char[] reverse(char arr[]){


		int start=0, end=arr.length-1;
		while(start<end){
	
			char temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;
		}
		return arr;
	}

	public static void main(String [] args){

		char arr[]={'a','j','a','y'}; 

		char arr1[]=reverse(arr);
		System.out.println(Arrays.toString(arr1));

	}
}
