import java.util.*;

class Ajay {

    static String greatestLetter(String s) {
        
	 for(char i = 'z'; i >= 'a'; i--) {
            char upper = (char) (i - 32);
            String lower = Character.toString(i);
            String upperStr = Character.toString(upper);

            if (s.contains(lower) && s.contains(upperStr)) {
                return upperStr;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTcOdE"));
    }
}

