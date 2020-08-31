package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer () ;
		
//		com.setRemote(new RemoteControl() { // new RemoteControl ctr +spacebar 
//			
//			@Override
//			public void volumeUp() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void volumeDown() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				
//			}
//			
		
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		
		System.out.println(" ===================== ");
		Tv tv = new Tv () ;
		
		tv.getRemote().turnOn () ;
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
		
 	}
}
