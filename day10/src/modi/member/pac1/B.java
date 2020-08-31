package modi.member.pac1;

public class B {

	public B() {
		A a = new A () ;
		a.var1  =1 ;
		a.var2 = 1;
//		a.var3 =1;  (x) 
//		
		System.out.println(a);
		a.method1();
		a.method2();
//		a.method3(); // (X)
		
	}
	
}
