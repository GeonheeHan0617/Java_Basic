
package generic.basic02;

public class Main {

	public static void main(String[] args) {
	
		Basic<Integer , String > b = new Basic <> ();
		
		b.put(1, "홍길동");
		
		String name = b.get(1); 
		
		System.out.println(b.toString());
		
		
		System.out.println("========================================");
		Basic<Integer, Person> b2 = new Basic<>();
		
		b2.put(1, new Person() );
		Person p = b2.get(1);
	
		System.out.println(b2.toString());
	
	}
}