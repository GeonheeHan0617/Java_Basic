package static_single;

public class MainClass {

	public static void main(String[] args) {
		
		//Exception in thread "main" java.lang.StackOverflowError
		//Singleton instance = new Singleton();
		
		System.out.println("뭐 해볼까? ");
		
//		Singleton.instance = null;
//		System.out.println(Singleton.instance);
	
		System.out.println("=====");
		
		Singleton s1 =Singleton.getInstance();
		Singleton s2 =Singleton.getInstance();
		Singleton s3 =Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.getName() );
		System.out.println(s2.getName() );
		System.out.println(s3.getName());
 	}
}
