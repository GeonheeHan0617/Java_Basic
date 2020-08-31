package collection.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static  void main(String[] args) {
	
		// HashMap 객체생성
		
//		HashMap<K,V> map = new HashMap() ;
//		
//		Map<K,V> map = new HashMap() ;
//		
		Map<Integer, String> map = new HashMap <> ();
		
		map.put(1, "홍길동");
		map.put(2,"이순신" ) ;
		map.put(3, "홍길자" ) ;
		map.put(4, "신사임당");
		
		System.out.println("맴의 크기: " + map.size());
		System.out.println("======-===-===-==-=======");
		System.out.println(map.toString());
		
		// 맴에 값은 key를 저장 했을 경우, 추가하지 않고, key에 value를 수정합니다.
		map.put(4,"김유신");
		System.out.println(map.toString());
		System.out.println("=======-+=======-+=======");
		// map에 저장된 value값 열기 get(key)
		String value = map.get(3);
		
		System.out.println("3번의 지정 값:" + value);
		
		// map 에 저장된 값을 순서대로 출력하려면 keySet, entrySet
		
		Set<Integer> keySet= map.keySet();
		System.out.println(keySet.toString());
		System.out.println("==============-+|=======");
		
		for(Integer i : keySet) {
			System.out.println(map.get(i));
		}
		
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext() ) {
		
			int i = iter.next();
		System.out.println(map.get(i));
			System.out.println("===================");
		}
		////////////////////////////////////
		
		Set <Entry<Integer, String >> entry = map.entrySet(); 	//Entry 타입으로 반환
		
		for( Entry<Integer, String > me : entry ) {
			System.out.println(me.getValue() + ":" + me.getValue());
			
			
		}
		// map에 있는 key 유무 확인
		if(map.containsKey(1)) {  // key 가 있다면 true , false 
			System.out.println("1번 키는 포함되어 있습니다. ");
			
		}
		System.out.println("=========++++++++++++++++");
		// map의 데이터 삭제 remove (key) 
		map.remove(2) ;
		System.out.println(map.toString());
		
	}
}
