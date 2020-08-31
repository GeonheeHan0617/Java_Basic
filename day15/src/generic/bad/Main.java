package generic.bad;

public class Main {

	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		abc.setObj("홍길자");
 	
		String name = (String)abc.getObj();
		
		ABC p = new ABC ();
		p.setObj(new Person());
		
		
		String name2 = (String)p.getObj(); //at generic.bad.Main.main(Main.java:[n])
		
		// Object 형으로 전환하면 무엇이든 저장 할 수 있다. 
		// 반대로 저장했던 값을 사용할 때 타입별로 형변환을 해야하는 문제가 발생
		// 잘못 형변환 한다면 예외 발생함.
		}
}
