package anonymous.basic02;

public class Computer {

	
	// 맴버변수
	private int sound;
	
	private RemoteControl remote;
	
	
	// 생성자
	public Computer() {
		
	
	remote =new RemoteControl() {  // remote = new (ctl+space)
		
		
		@Override
		public void volumeUp() {
			// TODO Auto-generated method stub
			sound ++ ;
			System.out.println("컴퓨터의 볼륨: " + sound);
		}
		
		@Override
		public void volumeDown() {
			// TODO Auto-generated method stub
			sound -- ;
			System.out.println("컴퓨터의 볼륨: " + sound);
		}
		
		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("컴퓨터를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
		System.out.println("컴퓨터를 끕니다.");
			
		}
	};
	
	}
	

	// remote의 객터 메서드
	public RemoteControl getRemote ( ) {
		return remote;  
	}
	
	public void  setRemote (RemoteControl remote ) {
		this.remote = remote;

	
	}
}
