package thread.ex01;

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
	
//		Thread.sleep(100);  // 이상태에서  마우스에 가까이 접근하기
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
			
		}
	} 
}
