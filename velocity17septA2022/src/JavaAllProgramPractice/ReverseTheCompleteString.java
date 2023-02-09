package JavaAllProgramPractice;

public class ReverseTheCompleteString {
	
	public static void main(String[] args) {
		
		String a = " my name is sanket";
		
		String[]b= a.split(" ");
		
	//	for (int i = 0;i<b.length;i++)
	//	{
	//		System.out.print(b[i]+" ");
	//	}
	//	System.out.println("");
		for(int i =b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	

}
}