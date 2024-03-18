

class Ajay{

	static int minimum(int [] nums){
	
	int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

           
            if (nums[left] < nums[right]) {
                return nums[left];
            }
        
            if ((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] < nums[mid + 1])) {
                
                return nums[mid];
            }

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
       
       	return nums[left];
	
	}
	public static void main(String [] args){
	
		int arr[]={3,4,5,1};
		System.out.println(minimum(arr));
		
		int arr1[]={3,4,5};
		System.out.println(minimum(arr1));

	}
}



