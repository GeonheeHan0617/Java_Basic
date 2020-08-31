package day03;

public class IfEx01 {

	public static void main(String[] args) {
		// 0~ 100까지 정수 램덤값
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수:" + point);
		
		if(point >= 60) {
			System.out.println("60점 이상입니다. ");
			System.out.println("축하합니다^^");
		}else {
			System.out.println("60점 미만입니다. ");
			System.out.println("다음기회에 도전하세요!!");
		}
		
		/* if (point <60) {
		 System.out.println("60점 미만입니다.");
		}
		*/
	}
}
