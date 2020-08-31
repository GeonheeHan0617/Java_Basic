package inter.basic2;

public class Cat extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("고양이는 물고리를 먹습니다. ");
		
	}

	@Override
	public void play() {
		System.out.println("고양이를 돌봅니다.");
		// TODO Auto-generated method stub
		
	}

}
