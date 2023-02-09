package JavaAllProgramPractice;

public class SeperateSpecialChar {
	
	public static void main(String[] args) {
		
		String a = " @#$%^DFRchgacg!*";
		
		
		a = a.replaceAll("[^a-zA-Z0-9]","");
		System.out.println (a);
		
		
	}

}
