import java.util.*;
class Ajay {
    
	static void duplicateZeros(int[] arr) {
        
		List<Integer>list=new ArrayList<>();
        
		for(int i=0;i<arr.length;i++){
            
			if(arr[i]==0){
                
				list.add(0);
            
			}
            		list.add(arr[i]);
        	}
        	for(int i=0;i<arr.length;i++){
            		arr[i]=list.get(i);
       		}
        
		System.out.println(Arrays.toString(arr));
   
       	}

    
	public static void main(String []args){
 
	
	       	int  arr[]={1,0,2,3,0,4,5,0};

		duplicateZeros(arr);
    
    }
}
