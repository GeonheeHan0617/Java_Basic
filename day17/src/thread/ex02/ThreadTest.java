package thread.ex02;

public class ThreadTest implements Runnable  {
	int num = 0 ;

	
	
	@Override
	public synchronized void run() { // ctrl + space 로 찾음
		// TODO Auto-generated method stub
		for ( int i = 1 ; i <= 10; i ++ ){
			
	if(Thread.currentThread().getName().equals("A")) {
		System.out.println("---------------------------------");
		num ++ ;
	}
	
	System.out.println("쓰레드 명 : " + Thread.currentThread().getName()+"Num:" +num);
	
	
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	} 
}
