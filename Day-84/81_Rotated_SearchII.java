class Ajay {
    static boolean search(int[] nums, int target) {
        
        if(nums.length <2 && target == nums[0]) return true; 
        if(nums.length <2 && target != nums[0]) return false; 
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target || nums[low]==target || nums[high]==target){
                return true;
            }else if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
    
	    int arr[]={0,1,2,3,5};

	    int target=2;

	    System.out.println(search(arr,target));
    }
}
