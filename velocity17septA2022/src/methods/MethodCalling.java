package methods;

public class MethodCalling {

public static void m1 () {
	System.out.println ("m1 is static method");
	
	
}
public void m2() {
	m1();
	
}

public static void main (String[] args) {
	MethodCalling ob = new MethodCalling();
	ob.m2();
	
}
	
}