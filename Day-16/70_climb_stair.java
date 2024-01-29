class Future{

    static int climb(int num){

        if(num<=3){

            return num;

        }else{

            int a=2;
            int b=3;
            int c=0;
            for(int i=0 ;i<num-3 ; i++){
               
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
            return c;
        }
    }
    public static void main(String[] args) {

        int num = climb(6);
        System.out.println(num);
    }
}


