package JavaAllProgramPractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringInArray {
	
	public static void main(String[] args) {
		
	
	
	String [] a= {"sanket","sanket","butle","kothari","kothari","maharashtra","maharashtra"};
	
	HashMap<String,Integer>cc= new HashMap<String,Integer>();
	
	
	for(String dd:a) {
		if(cc.containsKey(dd)) 
			cc.put(dd,cc.get(dd)+1);
		else 
		cc.put(dd, 1);
		
				
	
	}
	
	Set<String>keys=cc.keySet();
	for(String key:keys) {
		if(cc.get(key)>1)
			System.out.println(key+":"+cc.get(key));
		


}
}
}