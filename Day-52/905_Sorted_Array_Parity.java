import java.util.*;
class Ajay {
   
   static int[] sortArrayByParity(int[] nums) {
        
        int even=0;
        int odd=nums.length-1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length ;i++){

            if(nums[i]%2==0){

                arr[even]=nums[i];
                even++;
            }else{

                arr[odd]=nums[i];
                odd--;
            }
        }
        return arr;
    }

   public static void main(String [] args){

	   int arr[]={2,3,1,4};
	   int sort[]=sortArrayByParity(arr);
	   System.out.println(Arrays.toString(sort));
   }

}
