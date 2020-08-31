package thread.thread;

public class ThreadTest extends Thread{
	
	public void run() {
		
		System.out.println(getName());
		
		System.out.println("쓰래드 시작 1" );
		
		
		for ( int i = 1; i <= 10; i ++ ) {
			System.out.println(i);
		}
		
		try {
			sleep(1000);
			
		}catch(InterruptedException e)  {
			
			e.printStackTrace();
		}
		
	}

	
}
