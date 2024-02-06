import java.util.*;
class Solution {
     static String reverseOnlyLetters(String s) {
        
       
	int end=s.length()-1;
	char arr[]=s.toCharArray();
	int start=0;

	while(start<=end){

		if (!((arr[start] >= 'a' && arr[start] <= 'z') || (arr[start] >= 'A' && arr[start] <= 'Z'))) {
                
			start++;
            	
		} else if (!((arr[end] >= 'a' && arr[end] <= 'z') || (arr[end] >= 'A' && arr[end] <= 'Z'))) {
                
			end--;
          
		} else {
                
			char temp = arr[start];
                
			arr[start] = arr[end];
                
			arr[end] = temp;
                	start++;
                	end--;
		}
	}
        return new String(arr);

    }
    public static void main(String [] args){

	    String str = "OPm+@aE@OZ";
	    System.out.println(str);
	    String str1 = reverseOnlyLetters(str);
	    System.out.println(str1);
    }
}
