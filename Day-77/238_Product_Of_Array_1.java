import java.util.*;
class Ajay{

	static int [] product(int nums[]){
	
	int res[] = new int[nums.length];
        int prefix = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;   

	}
	public static void main(String [] args){
	
		int arr[]={1,2,0};

		int arr1[]=product(arr);

		System.out.println(Arrays.toString(arr1));

	}
}
