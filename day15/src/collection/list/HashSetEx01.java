
package collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		Set< String > set = new HashSet<> () ;
		
		// set 에 추가add()
		
		set.add( "JAVA");
		set.add( "JSP" ); 
		set.add( "Spring");
		set.add( "ORACLE");
		set.add( "JAVA"); //X 중복 
	
		// set에 대한 저장의 크기
		System.out.println("set의 크기:" + set.size() );
		System.out.println(set.toString());

		// set에 저장된 객체를 검색하려면, 반복자를 통해서 한번씩 확인해봐야합니다.
		Iterator<String> iter = set.iterator();
//		iter.hasNext();
//		
		System.out.println("========");
//		System.out.println(iter.next());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("++++++++++++");
		// contains
		if(set.contains("JAVA")) {
			System.out.println("JAVA가 포함되어 있음");
		}
		//set 의 삭제 remove 
		System.out.println("JAVA");
		System.out.println(set.toString());
		
	}
	
}
