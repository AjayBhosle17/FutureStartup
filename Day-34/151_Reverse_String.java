import java.util.*;
class Demo{

	static String reverseString(String s){
		
		String arr[]= s.split("\\s+");

		int start=0;
		int end=arr.length-1;

		while(start<end){

			String temp = arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		return String.join(" ",arr).trim();

	}
	public static void main(String [] args){

		String str= "a  good    example";
	//	String arr[]= str.split("\\s");

		String str1= reverseString(str);

		System.out.println(str1);
	}
}
