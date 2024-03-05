import java.util.*;

class Solution {
    static int[] frequencySort(int[] nums) {

        Map <Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            if(m.containsKey(i)){ m.put(i, m.get(i)+1);}
            else m.put(i, 1);
        }

        Map <Integer,ArrayList> mr = new HashMap<>();

        List<Integer> l = new ArrayList<>();
        for(int i : m.keySet()){
            

            mr.put(m.get(i), i);
        }   

        int index=0;
        for(int i : mr.keySet()){
            int num =i;
            while(num>0){
                nums[index]= mr.get(i);
                num--;
                index++;
            }
        }   
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int []{2,3,1,3,2})));
    }
}