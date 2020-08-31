package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Randomreat {

	public static void main(String[] args) {
		
	
	
	/*
	 *1. 사람 수를 입력 받습니다. 
	 *2. 입력받은 사람수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다.  
	 * 
	 *3. 해당배열의 크기만큼 - 으로 출력해주세요. 
	 *4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
	 *5. 제대로 선택된 좌석이라면 자리 번호를 공개하고, 제대로 선택되지 않은 좌석이면 " 경고문을 띄 어주세ㅛㅇ"
	 *
	 *선택된 자리는 * 로 다시 표시해주세요!!
	 * 
	 * 
	 */
	
//		Scanner scan = new Scanner(System.in); //숙제
//		//System.out.println("1 2 3 4 5");
//		//System.out.println("○ ○ ○ ○ ○");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수를 입력하세요 : ");
		int human = scan.nextInt();
		int[] arr = new int[human];
		int num = 1;
		int temp = 0;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num++;
		}	
		System.out.println(Arrays.toString(arr));
		
		for(int j = 0; j < arr.length; j++) {
			int ran = (int)(Math.random()* human); // alt + shift + r 찾아바꾸기
			temp = arr[ran];
			arr[ran] = arr[j];
			arr[j] = temp;	
//			System.out.println(Arrays.toString(arr));
		}		
//		System.out.println(Arrays.toString(arr));
		String[] arr2 = new String[human];
		Scanner scanner =new Scanner(System.in);
		for(int k = 0; k< arr.length; k++) {
			arr2[k] = "○";
		}
		System.out.println(Arrays.toString(arr2));
		
		int count = 0;
		i : while(true) {
			System.out.println("좌석을 입력하세요:");
			int seat = scan.nextInt();
			if(arr2[seat-1].equals("○")) {
				arr2[seat-1] = "●";
				System.out.println("선택한 좌석은:" +arr[seat-1] + "입니다.");
				System.out.println(Arrays.toString(arr2));
				count ++; 
			}else {
				System.out.println("이미 선택된 좌석입니다.");
				System.out.println(Arrays.toString(arr2));
				continue;
			}
			if(count == human) {
				System.out.println("좌석 선택이 끝났습니다. ");
				break i;
			}			
			
		}
		
			
		System.out.println(Arrays.toString(arr));//배열된 위치나옴
		
		
		
		
	
		 	
		 	
		}
	}

	

