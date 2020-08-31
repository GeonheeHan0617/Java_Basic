package quiz03;

import java.util.ArrayList;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		// 현실에 찾아볼 수 있는 물건, 생각해서 클래스로 표현 2개이상
		// 맴버변수 3개이상, 메서드 3개 이상
		// 생성해서 사용함
		
		Kick mo1 = new Kick("홍길동",2000,"헬멪");
		
	
		Kick mo2 = new Kick("김철수",4000,"털모자");
		
	
		Kick mo3 = new Kick("이산", 5000,"수영모자");
		
		List <Kick> list = new ArrayList<> ();
		list.add(mo1);
		list.add(mo2);
		list.add(mo3);
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("성명: "+ list.get(i).getName());
			System.out.println("가격: "+list.get(i).getMoney());
			System.out.println("모자명:"+ list.get(i).getHat());
		}
	}
}
