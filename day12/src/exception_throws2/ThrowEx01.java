package exception_throws2;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		
		// 예외 강제 발생시키기 Throw
		/*
		 * 메서드나 생성자 실행도중에 throw 키워드를 만나면
		 * 즉시 throw 로 생성한 예외가 발생합니다. 
		 * 
		 * 예외가 발생되면 실행되면 코드는 즉시 중단되고 예외를 처리할 수 있는 catch문 으로 바로 이동하게 합니다. 
		 * 즉, 메서드를 강제 종료할 때 사용할 수 있습니다. 
		 * 
		 */
		
		
		try { 
		System.out.println("결과: " +calc(10) );
		System.out.println("결과: " +calc(-10) );

		}catch (Exception e) {
			System.out.println(e.getMessage());		// 밑에 throw new Exception 값 안 두면  null 이라고 표시남
			// 예외 발생시 전달할 예외 메세지를 열어오는 기능
			e.printStackTrace();		//printStackTrace() 예외의 경로를 추적하는 메시지를 출력해봅니다. (예외 원인을 찾을 때  매번 사용됩니다. )
			
		}
		System.out.println("프로그램 종료합니다. ");
	}
	
	public static int calc (int n) throws Exception  { // int 형은 중지 할 수 없음 return 형이 있어서
		
		if (n<=0) {
			throw new Exception ("0보다 큰 값입니다. "); 
		}
		
		int sum =0;
		for(int i = 1; i <=n; i++){
			sum += i;
		}
		return sum;
	}
}
