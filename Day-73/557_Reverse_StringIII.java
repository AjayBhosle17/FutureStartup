class Solution {
    
	static String reverseWords(String s) {
		
		String[] arr = s.split("\\s");
    
		StringBuffer sb = new StringBuffer();
    		
		for (int i = 0; i < arr.length; i++) {
        
			int start = 0;
        
			int end = arr[i].length() - 1;
        		char[] arr1 = arr[i].toCharArray();

        		while (start < end) {
            		
				char temp = arr1[start];
            			arr1[start] = arr1[end];
            			arr1[end] = temp;
            			start++;
            			end--;
			}

        		sb.append(arr1).append(" ");
   		 }

		String str2 = sb.toString().trim();
    		return str2;

    	}	

	public static void main(String [] args){
	
		System.out.println(reverseWords("Ajay Bhosle"));

	}
}
