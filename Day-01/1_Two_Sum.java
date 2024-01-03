import java.util.Arrays;

class Anshu{
	static int [] two_sum(int test_case[],int target){
		for(int i=0 ; i<test_case.length ; i++){
			for(int j=i+1 ; j<test_case.length ; j++){
				if(test_case[i]+test_case[j] == target)
					return new int[]{i,j};
			}
		}
		return new int[]{-1};
	}
	public static void main(String [] args){
		
		int test_case_1[] = new int[]{2,7,11,15};
		int target_1 = 9;
		int test_case_2[] = new int[]{3,2,4};
		int target_2 = 6;
		int test_case_3[] = new int[]{3,3};
		int target_3 = 6;

		System.out.println("--- test case 1 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_1)+"\nOutput: "+Arrays.toString(two_sum(test_case_1,target_1)));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_2)+"\nOutput: "+Arrays.toString(two_sum(test_case_2,target_2)));
		System.out.println("--- test case 3 ---");
		System.out.println("Input: nums = "+Arrays.toString(test_case_3)+"\nOutput: "+Arrays.toString(two_sum(test_case_3,target_3)));
	}
}
