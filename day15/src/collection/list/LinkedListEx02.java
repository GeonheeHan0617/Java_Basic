package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx02 {

	public static void main(String[] args) {
		
		Queue<String> list = new LinkedList<>();
		
		// 추가
		list.add("홍길동");
		list.add("홍길자" );
		list.add("김철수") ;
		
		//확인
		System.out.println(list.toString());

		//처음에 추가
		((LinkedList<String>) list).addFirst("이순신");
		((LinkedList<String>) list).addLast("신사임당");
		
		System.out.println(list.toString());
		
		// 값 찾기
		String name = ((LinkedList<String>) list).get(0);
		System.out.println("0번째 인덱스의 값:" + name);
		
		list.remove(0);
		System.out.println(list.toString());
		
		
	}
}
