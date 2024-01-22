
class Future{

    static int romanInt(String str){

        char arr[] = str.toCharArray();
        int sum=0;
        for(int i=0 ;i <arr.length;i++){
            char ch1 = str.charAt(i);
                
            if((i+1)< arr.length &&  getdata(ch1) < getdata(str.charAt(i+1))){
                sum=sum- getdata(ch1);
             }else{
                sum=sum+ getdata(ch1);
             }
        }
        return sum;
    }  
    static  int  getdata(char ch){

             if(ch=='I'){
                return 1;
             }else if(ch=='V'){
                return 5;
            }else if(ch=='X'){
                return 10;
            }else if(ch=='L'){
                return 50;
            }else if(ch=='C'){
                return 100;
            }else if(ch=='D'){
                return 500;
            }else if(ch=='M'){
                return 1000;
            }
            return -1;
    }


    public static void main(String[] args) {
        String str= "III";
        int sum = romanInt(str);
         String str1= "LVIII";
        int sum1 = romanInt(str1);
        System.out.println(sum);
        System.out.println(sum1);

    }
}