import java.util.*;
class Ajay {
 
     	static int[] relativeSortArray(int[] arr1, int[] arr2) {
        

		Arrays.sort(arr1);
		int arr3[]=new int[arr1.length];
		int k=0;
		

		for(int i=0 ;i <arr2.length;i++){
		
			for(int j=0 ;j<arr1.length;j++){
			
				if(arr2[i]==arr1[j]){
				
					arr3[k]=arr1[j];
					k++;
				}
			}
		}
		
		for (int j = 0; j < arr1.length; j++) {
           
		       	boolean found = false;
           
		       	for (int i = 0; i < arr2.length; i++) {
                
				if (arr1[j] == arr2[i]) {
                    
					found = true;
                    
					break;
                
				}
            
			}
            
			if (!found) {
                
				arr3[k] = arr1[j];
                
				k++;
            
			}
        
		}

		return arr3;

    
	}
	public static void main(String [] args){
	
		int arr1[]={2,3,1,3,2,4,6,7,9,2,19};
		int arr2[]={2,1,4,3,9,6};
		int arr3[]=relativeSortArray(arr1,arr2);

		System.out.println(Arrays.toString(arr3));
	}
}
