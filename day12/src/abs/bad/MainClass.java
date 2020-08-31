package abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		// 재정의를 빼먹는다면, 잘못된 메서드의 실행으로 이어질 수도 있다는 뜻입니다.
		HeadStore ic = new IcStore() ;
		ic.apple();
		ic.banana();
		ic.melon();
		ic.orange();		// 프로그래머가 orange를 실수로 메서드 재정의르 빼 먹었다. 
		
	
	
	}
}
