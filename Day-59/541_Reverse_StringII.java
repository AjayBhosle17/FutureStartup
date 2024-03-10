import java.util.*;
class Solution {
    
	static  String reverseStr(String s, int k) {

        char arr[]=s.toCharArray();

                for(int i=0; i<s.length() ; i+=2*k){

                    int start=i;
                    int end=Math.min(i+k-1,arr.length-1);

                    while(start<end){
                        char temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                        end--;
                        start++;
                    }
                }

                return new String(arr);
	}

	public static void main(String [] args){

		
		String str="abcde";
		int k=2;

		String str1=reverseStr(str,k);
		System.out.println(str1);

	}
}	
