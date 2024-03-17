class Ajay{

	static boolean detect(String word){

			
		int n = word.length();
    		int count = 0;

    		for (char c : word.toCharArray()) {
        	
			if (Character.isUpperCase(c)) {
            			count++;
        		}
    		}

    		return count == 0 || count == n || (count == 1 && Character.isUpperCase(word.charAt(0)));
	}
	public static void main(String [] args){
	
		System.out.println(detect("USA"));
		System.out.println(detect("FlaG"));
		System.out.println(detect("g"));
		System.out.println(detect("Ajay"));
	}
}
