import java.util.*;

class Solution {
    
    static List<Integer> findWordsContaining(String[] words, char x) {
        

        List <Integer>ls=new LinkedList<>();

        for(int i=0 ;i<words.length;i++){

            char arr[]=words[i].toCharArray();
            
            for(int j=0 ;j<arr.length ;j++){

                if(arr[j]==x){

                    ls.add(i);
                    break;
                }
            }
        }

        return ls;
    }
    public static void main(String [] args){

        String str[]={"ajay","jay","rjaa","om"};
        char x='j';
        List <Integer> ls=findWordsContaining(str,x);

        System.out.println(ls);
    }

}