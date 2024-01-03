import java.util.*;
class Anshu{
    static int[] plus_one(int test_case[]){
        for(int i=test_case.length-1 ; i>=0 ;i-- ){
            if(test_case[i]!=9){
                test_case[i]+=1;
                return test_case;
            }else{
                test_case[i]=0;
            }
        }
        test_case = new int[test_case.length+1];
        test_case[0]=1;
        return test_case;
    }
    
    public static void main(String[] args) {
        int test_case_1[] = new int[]{1,2,3};
		int test_case_2[] = new int[]{4,3,2,1};
        int test_case_3[] = new int[]{9};

        System.out.println("--- test case 1 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_1)+"\nOutput: "+Arrays.toString(plus_one(test_case_1)));
        System.out.println("--- test case 2 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_2)+"\nOutput: "+Arrays.toString(plus_one(test_case_2)));
        System.out.println("--- test case 3 ---");
        System.out.println("Input: nums = "+Arrays.toString(test_case_3)+"\nOutput: "+Arrays.toString(plus_one(test_case_3)));
        
    }
}