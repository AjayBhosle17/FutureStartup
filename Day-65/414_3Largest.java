class Ajay {

    static int largest(int nums[]) {
        
	    long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
       	
	
	
        for (int i = 0; i < nums.length; i++) {
          
		
	if (nums[i] > max1) {


                max3 = max2;
		//System.out.println("max 3 "+ max3);
                max2 = max1;
                max1 = nums[i];

            } else if (nums[i] != max1 && nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];

            } else if (nums[i] != max1 && nums[i] != max2 && nums[i] > max3) {
		System.out.println("max 3 "+ max3);
                
                max3 = nums[i];
            }
        }

	
	if(max3==Integer.MIN_VALUE){
	
		return (int) max1;
	}
        
        return (int)max3;
    }

    public static void main(String[] args) {
        int arr[] = { 2,2,3,-2147483648};
        System.out.println(largest(arr));
    }
}

