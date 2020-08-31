package inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
	
	Animal baduk  = new Dog();
	Animal nabi  = new Cat() ;
	Animal hodol = new Tiger () ;
	
	

	// 1. animal [] 생성된 baduk, nabi , hodol 를 저장한 수에 향상된 for 문으로 Animall 공통 기능을 출력
	Animal [] arr = {baduk, nabi, hodol};
	
	for(Animal a : arr) {
		a.eat();
	}
	
	
	// 2. Ipet[] 생성후 	baduk, nabi  금붕어 를 저장하고 향상된 for 문으로 Ipet의 공통기능을 출력
	// baduk이는 Animal 타입이지만, 하위 클래스가 상호연관이 있다면, 형변환이 가능하다.
	
	
	IPet[] arr2 = new IPet[3] ;
	
	arr2[0] = (IPet) baduk;  // 폐쇄적이라
	arr2[1] = (IPet) nabi;
//	arr2[2] = new GoldFish();
	
	for(IPet i : arr2) 	{
		i.play();
	}
	System.out.println("==========================");
	
	PetHouse house = new PetHouse () ;
	house.carePet( (IPet ) baduk );
	house.carePet( (IPet ) nabi );
//	house.carePet( new GoldFish()) ;
	
	house.petInfo(arr2);
	}
}