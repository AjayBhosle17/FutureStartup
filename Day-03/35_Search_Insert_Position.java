import java.util.Arrays;
class Anshu{
    static int position(int test_case[], int target){
        int index;
        int start = 0;
        int end = test_case.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (test_case[mid] == target){
                return mid;
            }if(test_case[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start+1;
    }
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,3,5,6};
		int target_1 = 5;
		int test_case_2[] = new int[]{1,3,5,6};
		int target_2 = 2;
		int test_case_3[] = new int[]{1,3,5,6};
		int target_3 = 7;

        System.out.println("--- test case 1 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_1)+" , target = "+target_1+"\nOutput: "+position(test_case_1,target_1));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_2)+" , terget = "+target_2+"\nOutput: "+position(test_case_2,target_2));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_3)+" , terget = "+target_3+"\nOutput: "+position(test_case_3,target_3));
	

    }
}