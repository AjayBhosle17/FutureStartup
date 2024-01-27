class Solution {
    static String addStrings(String num1, String num2) {
        
        int sum1=0;
        int sum2=0;

        for(int i=0 ;i<num1.length() ;i++){

            sum1=sum1*10+num1.charAt(i)-'0';
        }
                

        for(int i=0 ;i<num2.length() ;i++){
            sum2=sum2*10 + num2.charAt(i)-'0';
        }
        int temp =sum1+sum2;
        System.out.println(temp);
        return Integer.toString(temp);
  
    }
     public static void main(String[] args){

        String a="11";
        String b ="123";

        String sum = addStrings(a,b);
        System.out.println(sum);
      }
}
