import java.util.*;
class Ajay{

    static List<Integer> find(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        
	ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1 ; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                ls.add(i);
            }
        }
        return ls;
    
    }
	public static void main(String [] args){
	
		int arr[]={1,1};
		
		System.out.println(find(arr));

	}
}
