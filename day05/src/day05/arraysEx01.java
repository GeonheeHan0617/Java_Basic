package day05;

public class arraysEx01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i :arr) {
			System.out.print(i);
		}
		System.out.println("");
	
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		for(String s : arr2) {
			System.out.print(s + "요일  ");
		}
		System.out.println("");
		
		int[] score = {33,55,44};
		double avg = 0;
		int sum = 0;
		for(int num : score) {
			sum += num;
		}
		
		avg = (double)sum / score.length;
		// 합계,평균
		System.out.println("----------------------------");
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum / score.length);
		System.out.printf("평균:%.2f\n", avg);
		System.out.println("평균: " + (int)(avg *100)/100.0);
		
	}
}
