package JavaAllProgramPractice;

public class RemovealphabetFromString {
	
	public static void main(String[] args) {
		
		String a = "d5de5dd56d5dd";
		
		int b= 0;
		String numericString ="";
		
		for (int i = 0;i<a.length();i++) {
			if (Character.isDigit(a.charAt(i))) {
				numericString = numericString + a.charAt(i);
				
			}
		}
		
		System.out.println("the numeric string is  "+ numericString);
		
	}

}
