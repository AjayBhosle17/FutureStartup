import java.util.*;

class Ajay{

	static boolean swap(String s,String goal){

		if(s.length()!=goal.length()){

			return false;
		}


		if (s.equals(goal)) {
			
			HashSet<Character> set = new HashSet<>();
			for (char c : s.toCharArray()) {
				if (!set.add(c)) {
					return true;
				}
			}
			return false;
		}
	
		List<Integer> diffIndexes = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != goal.charAt(i)) {
				diffIndexes.add(i);
			}
			if (diffIndexes.size() > 2) {
				return false; 
			}
		}
	
		return diffIndexes.size() == 2 && s.charAt(diffIndexes.get(0)) == goal.charAt(diffIndexes.get(1))
				&& s.charAt(diffIndexes.get(1)) == goal.charAt(diffIndexes.get(0));
	}

	


	public static void main(String [] args){

		String str="aab";
		String goal="aba";

		boolean swapData=swap(str,goal);
		System.out.println(swapData);

	}
}
