import java.util.*;
class Demo{

	static boolean happy(int n){
			
		
     	HashSet<Integer> hs = new HashSet<>();

        while (hs.add(n)){

            int sum = 0 ;

            while (n>0){

                sum+= (n%10) * (n%10);
                n/=10;

            }

            if (sum==1)
                return true;
	    else 
                n=sum;
            
	    

        }

        return false;
		
	}

	public static void main(String [] args){

		int x =19;
		boolean data = happy(x);
		System.out.println(data);
	}
}


