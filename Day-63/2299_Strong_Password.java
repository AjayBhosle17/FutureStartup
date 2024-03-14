class Solution {

    static boolean strongPasswordCheckerII(String password) {
        
        boolean lower=false;
        boolean upper=false;
        boolean digit=false;
        boolean special=false;
        char prev='\0';

        if(password.length()<8){
            return false;
        }

        for(char c:password.toCharArray()){
            if(Character.isLowerCase(c)){
                lower=true;
            }else if(Character.isUpperCase(c)){
                upper=true;
            }else if(Character.isDigit(c)){
                digit=true;
            }else if("!@#{{code}}^&*()%-+".indexOf(c)!=-1){
                special=true;
            }
            if(c==prev){
                return false;
            }
            prev=c;

        }

        return lower && upper && digit && special;

    }

    public static void main(String [] args){
    
	    System.out.println(strongPasswordCheckerII("ajay@123"));

    }
}
