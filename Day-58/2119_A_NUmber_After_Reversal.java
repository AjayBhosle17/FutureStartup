class Solution {
    static boolean isSameAfterReversals(int num) {
        
	    int x=num%10;
	    if(num==0){

		    return true;
	    }

	    if(x==0){

		    return false;
	    }
	    return true;
    }

    public static void main(String [] args){

	    int  num=100;
	    boolean x=isSameAfterReversals(num);

	    System.out.println(x);
    }

}
