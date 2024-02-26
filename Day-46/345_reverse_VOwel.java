import java.util.*;
class Demo{

    	
	static boolean Vowel(char c) {
    
	    
        	 return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U';

	}
	static String reverse(String str){
	
		//str = str.toLowerCase();
        
		int start = 0;
        
		int end = str.length() - 1;
        	char arr[] = str.toCharArray();

        	while(start < end) {
           
			if(Vowel(arr[start])) {
                
		    	while (!Vowel(arr[end])) {
                    
				end--;
                
			}        
                	char temp = arr[start];
                	arr[start] = arr[end];
                	arr[end] = temp;
                	end--;
			}
            		start++;
		}
        	return new String(arr);
    
	}

	public static void main(String [] args){

		String str = "mango";

		String str2=reverse(str);
		System.out.println(str2);
	}
}
