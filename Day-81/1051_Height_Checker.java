import java.util.*;

class Solution {

    static int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        
        int cnt = 0;
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(arr));
    }
}

