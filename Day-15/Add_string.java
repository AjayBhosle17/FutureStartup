class Future{

      static String stringInt(String str1,String str2){

        int data=Integer.parseInt(str1);
        int data1 = Integer.parseInt(str2);

        int sum=data+data1;
        String str3=Integer.toString(sum);
        return str3; 

      }
      public static void main(String[] args){

        String a="11";
        String b ="123";

        String sum = stringInt(a,b);
        System.out.println(sum);
      }
}