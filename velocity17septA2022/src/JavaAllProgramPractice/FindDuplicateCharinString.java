package JavaAllProgramPractice;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharinString {
	
	public static void main(String[] args) {
		
		String a = "dkshvborQCccCkocj";
		char[]b=a.toCharArray();
		
		HashMap<Character,Integer>cc=new HashMap<Character,Integer>();
		
		for(char dd:b) {
			if(cc.containsKey(dd))
				cc.put(dd,cc.get(dd)+1);
			else
				cc.put(dd, 1);
			
		}
		Set<Character>keys=cc.keySet();
		
		for(char key:keys) {
			if(cc.get(key)>1)
				System.out.println(key+":"+cc.get(key));
			
		}
				
	}

}
