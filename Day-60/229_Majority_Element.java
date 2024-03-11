import java.util.*;

class Solution {
    static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ls;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int freq = n / 3;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > freq) {
                ls.add(entry.getKey());
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1)); 

        int[] nums2 = {1};
        System.out.println(majorityElement(nums2)); 

        int[] nums3 = {1, 2};
        System.out.println(majorityElement(nums3));
    }
}

