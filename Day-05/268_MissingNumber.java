import java.util.*;

class  Future{

    static int MissingNumber(int arr[]){

        int num = arr.length * (arr.length +1) /2;

        for(int i=0 ;i<arr.length ; i++){

            num= num - arr[i];
        }
    
        return num;
    }   

    public static void main(String[] args) throws Exception{
        
        int test_case_1[] = new int[]{3,0,1};
		int test_case_2[] = new int[]{0,1};
        int test_case_3[] = new int[]{9,6,4,2,3,5,7,0,1};

        System.out.println("--- test case 1 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_1)+"\nOutput: "+MissingNumber(test_case_1));
        System.out.println("--- test case 2 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_2)+"\nOutput: "+(MissingNumber(test_case_2)));
        System.out.println("--- test case 3 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_3)+"\nOutput: "+(MissingNumber(test_case_3)));
    }
            
}