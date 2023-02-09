package JavaAllProgramPractice;

public class RemovenumbersFromString {
	
	public static void main(String[] args) {
		
		String a = "d5de5dd56d5dd";
		
		int b= 0;
		String alphabetString ="";
		
		for (int i = 0;i<a.length();i++) {
			if (! Character.isDigit(a.charAt(i))) {
				alphabetString =alphabetString + a.charAt(i);
				
			}
		}
		
		System.out.println("the alphabetic string is  "+ alphabetString);
		
	}

}
