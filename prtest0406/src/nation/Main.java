package nation;

public class Main {

	public static void main(String[] args) {
		
		Person	p1 	=	new Person("01029293333" , "콩길동");
		System.out.println(p1.name );
		System.out.println(p1.nation);
		System.out.println(p1.number);
		/*
		 * p1.nation = "미국"; // final은 값을 변경할수 없음
		 */		
		
	}
}
