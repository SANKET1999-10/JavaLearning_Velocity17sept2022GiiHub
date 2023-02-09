package String;

public class occuranceofparticularcharecter {
	
	public static void main(String[] args) {
		
		int count =0;
		String a = "sanket";
		
		
		for (int i = 0;i<a.length();i++) {
			
			char b = a.charAt(i);
			if (b=='a') {
				count++;
				
			}
		}
		
		System.out.println(" no of a present in given string  " + count);
		
	}

}
