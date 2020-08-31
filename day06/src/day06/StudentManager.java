package day06;

import java.util.Scanner;

public class StudentManager { 			// 미국에 있는 주영이 형에게 요청해보기

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] birthList = new int [100];
		
		// 현재 고객수가 몇명이 저장 되었는 지 알기 위한 변수 count 선언
		int count= 0;
		// index를 조정할 변수 선언
		int index = -1;
		
		Start: while (true) {  //중첩 반복문
			System.out.println("[Info] - 고객수:"+ count+ ",현재위치:" + (index)); 
			System.out.println("[메뉴] 1.Insert[등록], 2.prev[이전], 3.next[다음], 4.Current[출력], 5.Update[수정], 6.Delete[삭제], 7.Quit");
			System.out.println("메뉴입력->");
			int menu = scan.nextInt();
			
			switch (menu) {
			
			case 1: 
				System.out.println("===== 고객정보 입력을 시작합니다 =====");
				/*
				 * index 이용
				 * 이름, 성별, 이메일, 출생년도를 입력 받아서 각각 배열에 저장 
				 * 사람 수를 증가 시킨다. 
				 */
				 
				
				System.out.println(" 성명: ");
				String name = scan.next();
				System.out.println(" 성별: ");
				String gender = scan.next();
				System.out.println("이메일 :");
				String email = scan.next();
				System.out.println("생년월일:");
				int birth = scan.nextInt();
				
				nameList[count] = name;
				genderList[count] = gender;
				emailList[count] =email;
				birthList[count] = birth;
				
				
 
				count++;
				
				System.out.println("==================================================");
				
				break;
			case 2:
				System.out.println("===== 이전 고객정보를 출력합니다 =====");
			
				System.out.println("->");
				if (index<=0) {   // 값 변경해보는 것 test 해보기
					System.out.println("고객정보가 없습니다");
				}else {
					System.out.println("이전 고객 정보를 출력합니다.");
					System.out.println("이름:" + nameList[index-1]+ " 성별:" +genderList[index-1]+ " 이메일 주소:"+ emailList[index-1]+ " 생년월일:"+ birthList[index-1]);
				
					index--;
				}
					
				/*
				 * index 가 0이하라면 '이전 고객 정보가 없습니다. 
				 * 그렇지 않으면 index를 이동해서 이전고객 정보를 출력합니다.
				 *
				 */
				System.out.println("==================================================");
				break;	
			case 3:
				
				System.out.println("===== 다음 고객정보를 출력합니다. =====");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다."
				 * 그렇지 않으면 index를 이동해서 다음 고객 정보를 출력하면 됩니다. 
				 * 
				 */
				if (index>=count-1 ) {// (=) index >=count -1 값변경해보는 것 test 해보기 
					System.out.println("다음 고객정보가 없습니다.");
				}else {
					

					System.out.println("이름:" + nameList[index+1]+ " 성별:" +genderList[index+1]+ " 이메일 주소:"+ emailList[index+1]+ " 생년월일:"+ birthList[index+1]);
					
					index++;
				}
				
				
				System.out.println("==================================================");
				break;	

			case 4:
				System.out.println("===== 현재 고객정보를 출력합니다.=====");
				/*
				 * 현재정보를 출력할 수 있는 조건을 생각해서 현재정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다." 를 출력하면 됩니다.
				 * 
				 */
				if (index>= 0 && index<count ) { // 출력가능한 조건 
					
					System.out.println("이름:" + nameList[index]+ " 성별:" +genderList[index]+ " 이메일:"+ emailList[index]+ " 생년월일:"+ birthList[index]);
				}else {
					System.out.println("현재 고객정보가 없습니다.");
				}
				
				
				System.out.println("==================================================");
	 			break;	
			case 5:
				System.out.println("===== 현재 고객정보를 수정합니다. =====");
				/*
				 * case 4랑 비슷하짐나 스케너를 통해서 순서대로 이름, 성별, 이메일, 출생년도를 입력 받아서 배열의 값을 수정하세요.
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다:" 를 출력하면 됩니다.
				 * 
				 */
				if(index>= 0 && index<count ) {  //case4와 비슷한 조건
					System.out.println(" 고객님의 성명: ("+ nameList[index] +"):");
					nameList[index] = scan.next();
					System.out.println(" 성별: ("+ genderList[index] + "):");
					genderList[index] = scan.next();
					System.out.println(" 이메일 주소:("+ emailList[index] +"):");
					emailList[index] = scan.next();
					System.out.println(" 생년월일:("+ nameList[index] +"):");
					birthList[index] = scan.nextInt();
					
				}else {
					
					System.out.println("수정할 데이터가 없습니다.");
					continue;	
				}	
				break;
				
			case 6:
			System.out.println("===== 삭제할 고객님 =====");
				/*
				 * 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index 부터 ~~ 뒤에 있는 배열 요소를 당겨와서 덫어 씌웁니다. 
				 * 고객수를 감소 시킵니다.
				 * 
				 * 그렇지 안흐면 "삭제할 데이터가 존재하지 않습니다." 를 출력하면 됩니다. 
				 * 
				 */
				if (index>= 0 && index < count ) {
					System.out.println(nameList[index] +"님의 정보를 삭제합니다.");
					for(int i =index; i < count-1; i++) {
						
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i+1];
						birthList[i] = birthList[i+1];
						
				
					}
				
				count --;
				
					
			}else {
					System.out.println("삭제할 데이터가 존재하지 않습니다.");
					continue;
				}
				break;
			case 7:
				
				System.out.println("프로그램을 종료합니다.");
				/*
				 * 무한 루프를 완전히 탈출
				 */
			
				
				
				scan.close();
				break Start;		// 앞에
			


			default:
				
				System.out.println("잘못 입력하셨습니다.");
				continue;
				
				
			}
			
		}
		
		
	}
}
