package javapackage;

import java.util.HashMap;
import java.util.Set;

public class child  {
	
	public static void main (String[]args ) {
		
		String a []  = {"sanket","pranay","sanket","pranay","bhushan"};
		
		 HashMap <String,Integer> obj = new HashMap <String,Integer>();
		 
		 
		  
		  for  ( String aa : a) {
			   if (obj.containsKey(aa))
				   obj.put(aa,obj .get(aa) + 1 );
			   else
				   obj.put(aa, 1);
			   
		   }
		  Set <String> keys = obj.keySet();
		   for (String key : keys) {
			   if (obj.get(key)>1);
			   System.out.println (key+":"+obj.get(key));
			   
		   }
		  
		  
		  
		  }
	

	
}

