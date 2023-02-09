package JavaAllProgramPractice;

public class AddAllNumberIndividually {
	public static void main(String[] args) {
		
		String a = "ab5ds51s2";  // 5+5+1+2=13
		
		int b = 0;
		
		String numberisstring ="";
		
		for (int i = 0;i<a.length();i++) {
			if(Character.isDigit(a.charAt(i))) {
				numberisstring = a.substring(i,i+1);
				
				b = b+Integer.parseInt(numberisstring);
				
			}
		}
		System.out.println("the numeric String is "+ b);
		
	}

}
