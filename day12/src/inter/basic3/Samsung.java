package inter.basic3;

public class Samsung implements Printed {

	public String name = "Samsung";
	
	@Override
	public void turnOn() {
	System.out.println(name); 
		System.out.println(" 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(name); 
		System.out.println(" 전원을 끕니다.");
		
	}

	@Override
	public void print(String document) {
	System.out.println(name);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(document);
		System.out.println("색상: "+ color);
	}

	@Override
	public int copy(int n) {
		for(int i =0 ; i <=n ; i++) {
			System.out.println(i + "장  복사완료");
		}
		return n;
	}

	
}
