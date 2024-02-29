import java.util.*;
class Demo{

	
	static boolean rotate(String s, String goal) {
       
        
			char arr[] = s.toCharArray();
	
			if (s.length() - 1 == goal.length() - 1) {
				
				int rotations = 0;
			   
			while (rotations < s.length()) {
					char temp = arr[0];
				 
			for (int i = 0; i < s.length() - 1; i++) {
					
				arr[i] = arr[i + 1];
				   
			}
					
			arr[s.length() - 1] = temp;
					rotations++;
			String str1=new String(arr);
			
			if (str1.equals(goal)) {
						
						return true;
					}
				}
				return false;
			} else {
				return false;
			}
		}
	   
	public static void main(String [] args){
	
		String str="abcde";
		String goal="cdeab";


		boolean check=rotate(str,goal);
		System.out.println(check);
	}
}
