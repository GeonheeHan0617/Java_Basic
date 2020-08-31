package thread.runable;

public class ThreadTest implements Runnable{ 
	
	public void run() {
		
		// 스레드 클래스에 정의도니 static 메서드 사용가능 
		Thread t = Thread.currentThread();
		t.getName();
//		System.out.println(Thread.currentThread().getName());
		System.out.println("쓰레드 시작 1 ");
		
		for (int i = 0 ; i <= 10 ; i++ ) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);		//1초 출력
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
