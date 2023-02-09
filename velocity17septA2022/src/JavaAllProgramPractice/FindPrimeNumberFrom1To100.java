package JavaAllProgramPractice;

public class FindPrimeNumberFrom1To100 {
	
	public static void main(String[] args) {
		
		for (int i = 1;i<=100;i++) {
			int b= 0;
			
			for (int j=1;j<=100;j++) {
				if(i%j==0) {
					b++;
					
				}
			}
			if(b==2) {
				System.out.print(i+" ");
			}
		}
	}

}
