class Future{

	static int Indexda(String str ,String needle){

		return str.indexOf(needle); 
	}
	public static void main(String [] args){

		String str = "AjayshriVivek";
		String needle="shri";

		int index = Indexda(str ,needle);
		System.out.println("String FOund At Index "+ index);
	}
}
