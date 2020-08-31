package thread.runable;

public class Mainclass {

	public static void main(String[] args) {
		
		// Runable 인터페이스를 구현하는 클래스를 , 쓰레드 클레스의 생성 자로 전달해야합니다. 
		ThreadTest t = new ThreadTest () ;
		Thread  thread = new Thread (t,"쓰레드 3");
		
		thread.start();
		
		
		System.out.println("매번 종료~");
	}
}
