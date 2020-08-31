package inter.basic3;

public class LG implements Printed {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	
		System.out.println("Life is good ");
		System.out.println("Turn On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Life is good ");
		System.out.println("Turn Off");
		
	}

	@Override
	public void print(String document) {
		// TODO Auto-generated method stub
		System.out.println("Life is good ");
		System.out.println("문서내용:" + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println("Life is good ");
		System.out.println("색상: " + color);
		System.out.println("문서내용:" + document);
	
		
		
	}

	@Override
	
	public int copy(int n) {
	System.out.println("Life is good");
	System.out.println(n + " face copy");
		return n;
	}

}
