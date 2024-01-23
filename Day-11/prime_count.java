class Future{

    static int prime(int num){

        int flag=0;
        for(int i=1 ; i<=num ; i++){
            int count=0;
            for(int j=1 ;j<=i;j++){

                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                    flag++;
            }
        }
        return flag;
    }
    public static void main(String [] args){

        int num=10;
        int count=prime(num);
        System.out.println(count);
    }
}