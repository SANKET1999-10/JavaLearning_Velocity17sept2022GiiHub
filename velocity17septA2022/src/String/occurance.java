package String;

import java.util.HashMap;

public class occurance {
	
	public static void main(String[] args) {
		
		String a = "language";
		
		int count;
		char ch;
		
		HashMap<Character,Integer>hashMap = new HashMap<Character,Integer>();
		for (int i = 0;i<a.length();i++) {
			ch = a.charAt(i);
			if (hashMap.containsKey(ch)) {
				count = hashMap.get(ch);
				count++;
				hashMap.replace(ch,count);
				
			}else {
				hashMap.put(ch,1);
				
			}
			
		}
		
		for (Character key : hashMap.keySet()) {
			System.out.println (key+" = "+hashMap.get(key));
			
		}
	}

}
