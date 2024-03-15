import java.util.*;
class Ajay {

	static List<String> FizzBuzz(int n){
			
	
		List<String> ls=new LinkedList<>(); 
		
		if(n<0){
		
			return ls;
		}

		for(int i=1 ;i<=n;i++){
		
			if(i%3==0 && i%5==0){
			
				ls.add("FizzBuzz");
			}else if(i%3==0){
			
				ls.add("Fizz");
			}else if(i%5==0){
			
				ls.add("Buzz");
			}else{
			
				ls.add(String.valueOf(i));
			}
		}
		return ls;

	}

	public static void main(String [] args){
	
		System.out.println(FizzBuzz(3));
	}
}
