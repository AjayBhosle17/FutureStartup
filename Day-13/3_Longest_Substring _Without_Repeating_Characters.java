import java.util.ArrayList;

class Anshu{
    static int lengthOfLongestSubstring(String s) {
       
        ArrayList <Character> al = new ArrayList<>();
                         System.out.println(al.size());

        int max = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(al.contains(s.charAt(i))){
                if(al.size()>max){
                    max = al.size();
                }
                al.clear();
               
            }
            al.add(s.charAt(i));
        }
        return max;
    }
    public static void main(String[] args) {
        
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("-- test case 1 --");
        System.out.println("input : "+s1+"\nOutput : "+lengthOfLongestSubstring(s1));
        System.out.println("-- test case 2 --");
        System.out.println("input : "+s2+"\nOutput : "+lengthOfLongestSubstring(s2));
        System.out.println("-- test case 3 --");
        System.out.println("input : "+s3+"\nOutput : "+lengthOfLongestSubstring(s3));
    }
}