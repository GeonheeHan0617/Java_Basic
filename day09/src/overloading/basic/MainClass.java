package overloading.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic bi = new Basic();
		bi.input(2);
		bi.input("1");
		bi.input(3,3.14);
		bi.input(3.1112222,3);
		bi.input("a","b");
		bi.input('b',12,13.14);
		
	}
}
