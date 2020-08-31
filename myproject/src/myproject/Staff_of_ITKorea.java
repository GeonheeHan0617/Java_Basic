package myproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Staff_of_ITKorea {
//	당신은 프로그램 개발회사 ITKorea의 직원이다. 회원관리 프로그램 제작의뢰가 들어왔다.
//	다음 요구사항에 따라 프로그램을 제작하고 결과를 사진 또는 zip파일로 제출해주세요.
//	요구사항정의
//	1. 프로그램 기능은 회원등록, 모든 회원정보 확인, 회원정보 검색, 비밀번호 찾기 이다
//	2. 회원아이디는 고유한 아이디어야 한다.
//	3. 비밀번호 찾기 방법은 최소 2가지 이상을 제시하여야 한다
//	예시) 아이디로 찾기, or email로 찾기 등
	


	public static void main(String[] args) {
	
		
		Scanner s = new Scanner (System.in);
		
		List<User> list = new ArrayList<> ();
		
		
		
		User u1 = new User("korea0617", "moma1111", " korea@naver.com");
		list.add(u1);
		User u2 = new User("moma0101", "korea1234"," moma@gmail.com") ;
		list.add(u2);
		User u3 = new User("cuty0202", "123123","gugucon@daum.net");
		list.add(u3);
		
		try {
		while(true) {
			
			System.out.println("1. 등록 / 2. 모든회원 정보 확인 / 3. 회원정보 검색 / 4. 비밀번호 찾기 ");
			System.out.println("메뉴를 입력해주세요  -> ");
			
			
			int n = s.nextInt();
			
			
			if ( n == 1) {
				// 스캐너로 이름, 나이를 입력 받고 Person 에 저장, 리스트에 추가
				System.out.println("===== 회원정보 입력을 시작합니다 =====");
			 	System.out.println("등록할 아이디를 입력해주세요 ->");
			 	String ID = s.next();
			
			 	System.out.println("등록할 비밀번호를 입력해주세요");
			 	String PW = s.next();
			 	
				System.out.println("이메일 ->");
				String Email= s.next();
				
				User user = new User (ID,PW,Email);
		
				list.add(user);
				
				
			}else if (n == 2) {
			
				
				for (User user : list) {
					System.out.println("아이디:" +user.getID()+ ", 이메일:" +user.getEmail() );
				}
				
			}else if (n == 3) {
				
				System.out.println("아이디->");
			 	String Id = s.next();
				
				for (int i = 0 ;  i<list.size() ; i ++ ) {

					if(list.get(i).getID().equals(Id)) {
						System.out.println("아이디:" +list.get(i).getID()+
								", 이메일:" +list.get(i).getEmail() );
						break;
				
					}
					if (i==list.size () -1 ) { 
						System.out.println(Id + "님의 목록이 없습니다. ");
					}
				}
					
				}else if (n ==4 ) {
					
					System.out.println("비밀번호 찾기 위해서 ID를  입력해주세요");
					String Id1 = s.next();
				for (int j = 0 ; j <list.size() ; j++) {
					
					if (list.get(j).getID().equals(Id1)) {
					System.out.println("공개합니다.");
					System.out.println("비밀번호->" + list.get(j).getPW());
					break;
					
					}
					if(j == list.size() -1) {
						System.out.println("회원의 아이디랑 이메일이 없습니다. ");
					}

					
				}

			}else {
				System.out.println("다시 입력하세요");
			
			
					}
		
				}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
