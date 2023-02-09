package practice;

public class StudentMarks {
	
	int Math;
	int Phy;
	int Chem ;
	
	public void sanket () {
		
		int math = 95;
	    int Phy = 100;
	    int Chem = 95 ;
	    
	    System.out.println("Marks of sanket ;" + "Math :"+ math + "Phy :" + Phy+ "Chem :"+ Chem);
	    System.out.println("Total marks :" + (math+Phy+Chem));
	    System.out.println ("");
	    
	    
	}
	
	public void bhushan () {
		
		int Math= 99;
		int Phy = 75;
		int Chem = 88;
		
		System.out.println ("Marks of bhushan :" + "Math" + Math + "Chem"+Chem+"Phy"+Phy);
		System.out.println("Total marks :" + (Math+Phy+Chem));
		System.out.println("");
		
	}
				
	
	public static void main (String[]args) {
		 StudentMarks obj = new  StudentMarks ();
		 
		 obj.sanket ();
		 obj.bhushan ();
	}
			
		}
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				 
		 
				 
	
