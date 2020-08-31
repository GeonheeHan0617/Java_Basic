package wrappeex;

public class WrapperExtest {

	public static void main(String[] args) {
		String s1 = "10"; String s2 = "5.43";
		
		int a = Integer.parseInt(s1); 
		double b = Double.parseDouble(s2); 
		float c = Float.parseFloat("4.53");
		
		System.out.println(a + b + c);
		System.out.println(Math.ceil(a+b+c));
	}
}
