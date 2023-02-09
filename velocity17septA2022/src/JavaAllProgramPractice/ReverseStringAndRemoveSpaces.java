package JavaAllProgramPractice;

public class ReverseStringAndRemoveSpaces {
	
	public static void main(String[] args) {
		
		String  s= "i like automation";
		 s=s.replaceAll("\\s","");
		 
		 String t ="";
		 for (int i = s.length()-1;i>=0;i--) {
			  
			 
			 t= t+s.charAt(i);
			 
			 
		 }
		 System.out.println (t);
	}

}
