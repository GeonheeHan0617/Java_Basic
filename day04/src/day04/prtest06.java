package day04;

public class prtest06 {

	public static void main(String[] args) {
		//258590원을 
		// 10만원수표 1만원 ,5000원,1000원 지패, 100원,10원 으로나눠서 개수 구하기 
		
		int [] arr = {100000,10000,5000,1000,100,10};
		int [] ea = new int [6];
		int i =0;
		
		int money = 258590;
		
		while (i<arr.length) {
			ea[i] = money/arr[i];
			money %= arr[i];
			System.out.println(arr[i]+"원"+ea[i]+"개");
			i++;
		}
	}
}
