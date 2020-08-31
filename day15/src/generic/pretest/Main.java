package generic.pretest;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	A <String> a = new A <> ();
	a.setValue("Mr. Han");
	String name =a.getValue();
	
	System.out.println(a.toString());
	
	
	A <Integer> a2 = new A <> ();
	a2.setValue(33);
	int num =a2.getValue();
	
	System.out.println(a2.toString());
	
	A <P> a3 = new A <> ();
	
	a3.setValue(new P());
	P p = a3.getValue();
	
	System.out.println(a3.toString());
	}
}
