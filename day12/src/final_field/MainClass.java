package final_field;

public class MainClass {

	public static void main(String[] args) {
		
		Parson han = new Parson ("123123", "한건희");
		System.out.println("국가: " + han.nation);
		System.out.println("주민번호: " +han.ssn);
		System.out.println(" 이름: " + han.name);
		
		Parson lee = new Parson ("456456", " 이산");
		System.out.println("국가: " + lee.nation);
		System.out.println("주민번호: " +lee.ssn);
		System.out.println(" 이름: " + lee.name);
	}
}
