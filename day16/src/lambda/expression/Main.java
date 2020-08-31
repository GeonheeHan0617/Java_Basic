package lambda.expression;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person () ;
		
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				System.out.println("안녕하세요 ");
			}
		});
		p.greeting(new Say02() {
			
			@Override
			public String talking() {
			System.out.println("Hola");
				return "Hola" ;
			}
		});
		
		p.greeting(new Say03() {
			
			@Override
			public String talking(String greet) {
			System.out.println(greet);
				return greet;
			}
		});
		// main 밖에 있음
		System.out.println("=================================================");

		// 익명객체 Say01의 구현해야할 추상메서드를 람다식으로 표현
		
		p.greeting( () -> {
			System.out.println("안녕하세요");	
		} );
		p.greeting( () -> {
			
			System.out.println("Hola");
			return "Hola";
		});
		p.greeting( (greet) -> {
			System.out.println(greet);
			return greet;	
		});
	
		////// greeting 메서드를 실행해서 결과로 HiHIHI 반환하는 람다 표현식 사용
		p.greeting( (result, i) -> {
			for (int n =1 ; n<=i; n++) {
				System.out.println( result);
			}
			return result ; 
		// 약간 어려웠음 !! 
		
		});
			
			
			
	
		
	}
}
