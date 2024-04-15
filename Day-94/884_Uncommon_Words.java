import java.util.*;

class Solution {

    static String[] uncommonFromSentences(String s1, String s2) {
        Set<String> hs = new HashSet<>();
        Set<String> hs1 = new HashSet<>();

        String[] arr = s1.split("\\s");
        String[] arr1 = s2.split("\\s");

        for (String word : arr) {
            if (!hs1.contains(word)) {
                if (!hs.add(word)) {
                    hs.remove(word);
                    hs1.add(word);
                }
            }
        }

        for (String word : arr1) {
            if (!hs1.contains(word)) {
                if (!hs.add(word)) {
                    hs.remove(word);
                    hs1.add(word);
                }
            }
        }

        return hs.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";

        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }
}

