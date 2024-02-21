import java.util.*;

class Demo{

	static String sort(String s){


		Map<Character, Integer> hm = new HashMap<>();
        
		for (char ch : s.toCharArray()) {
           
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
       
		}
        
        
		List<Character> list = new ArrayList<>(hm.keySet());
        
		System.out.println(list);
		Collections.sort(list, (a, b) -> hm.get(b) - hm.get(a));
		System.out.println(hm);
        
        
		StringBuilder sb = new StringBuilder();
       
		for (char c : list) {
           
			int count = hm.get(c);
           
			for (int i = 0; i < count; i++) {
                
				sb.append(c);
            
			}
        
		}
        
        
		return sb.toString();
	}

   
	public static void main(String[] args) {
       
		String str ="tree";

		String str2=sort(str);

		System.out.println(str2);

	}
}
