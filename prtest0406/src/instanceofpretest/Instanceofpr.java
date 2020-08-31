package instanceofpretest;

public class Instanceofpr {
	
	 
	    public static void main(String[] args) {
	 
	        FireEngine f = new FireEngine();
	        Ambulance a = new Ambulance();
	         
	        Instanceofpr test = new Instanceofpr();
	        test.doWork(f);
	        test.doWork(a);
	 
	    }
	 
	    public void doWork(Car c) {
	        if (c instanceof FireEngine) {
	            FireEngine f = (FireEngine)c;
	            f.water();
	             
	        } else if (c instanceof Ambulance) {
	            Ambulance a = (Ambulance)c;
	            a.siren();
	        }
	    }
	}
	 
	 
	 
	class Car {
	    String color;
	    int door;
	 
	    void drive() { //운전하는 기능
	        System.out.println("drive, brrrr~");
	    }
	 
	    void stop() { // 멈추는 기능
	        System.out.println("stop!!!");
	    }
	}
	 
	 
	class FireEngine extends Car {  // 소방차
	    void water() {              // 물 뿌리는 기능
	        System.out.println("warter!!!");
	    }
	}
	 
	class Ambulance extends Car {  // 앰뷸런스
	    void siren() {             // 사이렌을 울리는 기능
	        System.out.println("siren~~~~");
	    }
	



}
