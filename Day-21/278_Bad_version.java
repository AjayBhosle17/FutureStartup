import java.util.*;
class Future extends VersionControl{
 public int firstBadVersion(int n) {

        if(n<0){
            return -1;
        }

        if(n>Integer.MAX_VALUE){

            return -1;
        }
        if(n==1 ){
            return n;
        }
        if(n>=2 && n>1){

            return n-1;
        }
        return -1;   
    }
	public static void main(String [] args){



	}
}
