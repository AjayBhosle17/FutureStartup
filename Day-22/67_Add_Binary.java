class Solution {
    
	static String addBinary(String a, String b) {
        
        int len1=a.length()-1;
        int len2=b.length()-1;

        int binary=2,carry=0,sum=0;
        StringBuffer add= new StringBuffer();
        while(len1>=0 ||  len2 >=0){

            int num1=0 ,num2=0;
            sum=0;
            if(len1>=0){
                num1 = a.charAt(len1--)-'0';
            }
            if(len2>=0){
                num2 = b.charAt(len2--)-'0';
            }

            sum+=num1+num2+carry;

            if(sum>=binary){

                 carry=1;
                 sum=sum-binary;

            }else{

                carry=0;
            }
            add.append(sum);

        }

        if(carry==1){
            add.append(carry);
        }

        StringBuffer data = add.reverse();

        return data.toString();
    }
    public static void main(String[] args){

	    String str="101";
	    String str2="11";

	    String str3 =addBinary(str,str2);
	    System.out.println(str3);
    }
}


