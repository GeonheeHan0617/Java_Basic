package anonymous.basic02;

public class Tv {

	private int volume; 

	private RemoteControl remote;
	
	public Tv () {
		// remmote 타입을 Tv에 알맞게 익명 객체 방법으로 초기화해주세요.
	
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				volume ++ ;
				System.out.println("Volume of Tv: " + volume );
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				volume -- ;
				System.out.println("Volume of Tv: " + volume );
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Turn on Tv");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Turn off Tv");
			}
		};
			
		
	
	}
	
	// 게터 세터 
	
	public RemoteControl getRemote ( ) {
		return remote;
	}
	public void  setRemote ( RemoteControl remote) {
		this.remote = remote;
		
		
	}
	
	
}
