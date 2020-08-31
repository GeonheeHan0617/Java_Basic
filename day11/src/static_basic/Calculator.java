package static_basic;

public class Calculator {
	
	/*
	 * 계산기마다 색깔이나 결과값은 다를 수 있기 때문에
	 * 일반 맴버변수로 선언합니다. 
	 * 
	 * 계산기 마다 원주율은 동일하기 때문에 static 변수로 선언하게 좋습니다. 
	 */
	
	
	// 맴버변수
	private String color;
	private int result;
	
	public static double pi = 3.14 ;
	
	/*
	 * 일반 맴버변수를 참조하고 있는 메서드는 static 메서드로 선언하면 안됩니다.
	 * "
	 */
	
	public void setColor(String color) {
		this.color = color;
		
		
	}
	// static 사용하면 빨간줄 나옴
	public String getColor(){
		return color;
	}
	/*
	 * 메서드 내부에서 일반 맴버변수를 쓰지 않고
	 * 범용성 있게 사용하는 메서드는 static 키워드를 사용하는 것이 좋습니다. 
	 */
	
	public double circle(int r) {
		return r * r*pi;
	}
	
	public double rect( int side) {
		return side * side ;
	}
	
	
	
}
