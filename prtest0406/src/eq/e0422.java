package eq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e0422 {
	public static void main(String[] args) {
	List<String> list = new ArrayList<>(); list.add("홍길동"); list.add("박찬호"); list.add("이순신"); list.add("홍길자");
	Iterator<String> iter = list.iterator(); //반복자 
	while(iter.hasNext()) { System.out.println(iter.next() ); }
	}
}
