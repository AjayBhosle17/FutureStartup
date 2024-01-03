class Solution {
    static boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        int num1=x;
        int sum=0;
        while(x!=0){

            sum= sum*10 + x%10;
            x/=10;
        }

        return sum==num1;
    }
    public  static void main(String[] args) {
        
        int x=121;
        int y=-121;
        int z=10;
        boolean test_case1 = isPalindrome(x);
        boolean test_case2 = isPalindrome(y);
        boolean test_case3 = isPalindrome(z);

        System.out.println(x + " Output is " + test_case1 );
        System.out.println(y + " Output is " + test_case2 );
        System.out.println(z + " Output is " + test_case3 );
    }
}