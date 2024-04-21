import java.util.*;

class Ajay {
    
	
	static int[] diStringMatch(String s) {
       
		int n=s.length();
		int arr[]=new int[n+1];
		int x=0;
		int y=n;
		for(int i=0 ;i<n ;i++){
		
			if(s.charAt(i)=='I'){
			
				arr[i]=x++;
				
			}else{
			
				arr[i]= y--;
			}
		}
		arr[n]=y;
		return arr;
	}

	public static void main (String [] args){
	
		String s="DDI";
		System.out.println(Arrays.toString(diStringMatch(s)));
	}
}
