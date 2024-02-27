class Demo{

	static int peak(int arr[]){

		int index=-1;
		for(int i=1 ;i<arr.length-1 ;i++){

			if(arr[i]> arr[i-1] && arr[i]>arr[i+1]){

				index=i;

			}
		}
		
		if(index == -1) {

         
			int max = arr[0];
            		index = 0;
            		for(int i = 0; i < arr.length; i++) {
               
				if(arr[i] > max) {

                    
					max = arr[i];
                    
					index = i;
				}
			}
		}
		return index;
	}

	public static void  main(String [] args){

		int arr[]= {1};

		int inde=peak(arr);
		System.out.println(inde);
	}
}

