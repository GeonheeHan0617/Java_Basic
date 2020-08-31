package collection.list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
			// 중복 X , 자동으로 오름차순 정렬
			Set <String> set = new TreeSet<> ();
			
			set.add("강아지");
			set.add("고양이");
			set.add("강아지");
			set.add("강아지");
			set.add("늑대");
			set.add("늑대2");
			set.add("송아지");
			
			System.out.println(set.toString());
	
			Set <Integer> set2 = new TreeSet<> ();
			
			set2.add(100);
			set2.add(40);
			set2.add(-54);
			set2.add(89);
			set2.add(89);
			set2.add(7);
			set2.add(-54);
			set2.add(0);
			
			
			
			System.out.println(set2.toString());
			
	}
	
}
