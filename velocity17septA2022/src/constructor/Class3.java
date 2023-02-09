package HiPacakge;

import java.util.HashMap;
import java.util.Set;

public class child2 {
	
	public static void main (String[]args ) {
		
		String [] a= { "raju", "ramesh", "suresh", "raju","gopal", "ramesh"};
		  
		   HashMap<String,Integer> mRef = new  HashMap<String,Integer> ();
		   
		for (String aa : a) {
			
			if (mRef.containsKey(aa))
				mRef.put(aa, mRef.get(aa) + 1);
			   
		}
		
		Set <String> keys = mRef.keySet();
		
	for (String key:keys) {
		if (mRef.get(key)>1)
		System.out.println (key+":"+mRef.get(key));
		
	}
	}	
}