package Array;

public class FindNthHighestnumber {
	
	public static void main(String[] args) {
		
		int []a = {23,34,432,455,12,124,55,225,345,663,2255,2,77,6,7,8};
		int k=4;
		int empty;
		
		for (int i = 0;i<a.length;i++) {
			for (int j = i+1;j<a.length;j++) {
				
				if( a[i]<a[j]) {
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
					
				}
			}
		if (i==k-1)
		{
			System.out.print(a[i]);
			break;
			
		}
		
		}
		
	}

}
