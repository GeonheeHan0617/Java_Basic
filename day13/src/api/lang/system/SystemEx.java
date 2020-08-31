package api.lang.system;



public class SystemEx {

	public static void main(String[] args) {
		
		/*
		 * currentMillis(컴퓨터의 시계로부터 현재 시간을 읽어서 밀리세컨드(1/1000초) 단위와 나노세컨드(1/10^9초)단위 의 long값을 리턴합니다. 주로 프로그램의 실행 소요 시간 측정으로 성능을 테스트할 때 사용합니다.

		 */
		
		long start = System.currentTimeMillis();
	
		
		long sum = 0 ;
		
		for(long i = 1; i <=10000000000L;  i++) {
			sum +=i;
		}
		long end = System.currentTimeMillis();
	
		System.out.println("실행소요 시간:" +(end -start)*0.001);
		
	}
	
}
