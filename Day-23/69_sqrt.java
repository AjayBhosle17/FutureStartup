class Solution {
    static int mySqrt(int x) {
        
         x=(int)Math.pow(x, 0.5); 
        
        return x;
    }
    public static void main(String [] args){


	    int x=5;
	    int y= mySqrt(x);
	    System.out.println(y);
    }
}
