class  Future {

    static int lastword(String str){

        int count=0;
        for(int i=str.length()-1 ;i>-0 ;i--){

            if(' '!=str.charAt(i)){

                count++;
            }else{

                if(count>0){
                    return count;
                }
            }
        }
            return count;
    }
     
    public static void main(String[] args) {
        
        int  cnt = lastword("  Ajay Bhosle  ");
        System.out.println(cnt);
    }
}