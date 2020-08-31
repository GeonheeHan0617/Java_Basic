package randa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<> () ;
		
		
		for(int i = 0; i<100; i++ ) {
			list.add(new Random().nextInt(100) + 1) ;
			
		}
		
		System.out.println(list.toString());
		
		
		
		System.out.println("1=================================================");
		
		//중복제거 distinct() 
		
		Stream <Integer> stream = list.stream().distinct();
		
//		Stream <Integer> stream2 =stream.distinct();
		
		list.stream().distinct().forEach( (n) -> System.out.print(n+ " ") );
		System.out.println(" ");
		
		
		
		
		System.out.println("2=================================================");
		
		// 걸러내는 기능 filter() ;
		
		Stream <Integer > s1 = list.stream().filter( (n) -> /*num1 % 2 == 0 );*/  {
			return n % 2 ==0; 
		});
		
		s1.forEach((n)-> System.out.print(n + " ") );
		
		System.out.println(" ");
		System.out.println("3-----------------------------------------------------------");
		
		// 정렬 ,sorted()
		list.stream().sorted().forEach((n) -> System.out.print(n+ " "));
		
		System.out.println(" ");
		System.out.println("\n4-----------------------------------------------------------");
		
//		list.stream().map(new Function<T, R>() {
//
//			@Override
//			public R apply(T t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//	});
		
		
		//map () 은 메서드의 안에 정의된 새로운 stream으로 반환
		Stream <String > s2 = list.stream().map( (n) -> {
		
			return n % 2 ==0 ? "짝수" : "홀수" ;
			
		});
		
		s2.forEach( (str)  -> System.out.print((str) + " " ) );
		
		System.out.println("\n5---------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		List<Integer> result = list.parallelStream().filter((n) -> {
			return n % 3 ==0;
		}).collect( Collectors.toList());
		
		System.out.println(result.toString());
		System.out.println("\n6-----------------------------------------------------------");
		
		//list의 중복을 제거하고, 짝수만 찾아낸다음, 정렬하고, 짝홀수로 변경한 결과를 List로 반환받고 forEach구문으로 처리
		
		list.stream().distinct().filter( (n) ->  {
			return n % 2 == 0;
		}).sorted().map ( (n) -> {
			return n % 2 ==0 ? "짝수" : "홀수" ;
			
		}).collect(Collectors.toList()).forEach((s) -> System.out.print(s+ " "));
			
	
	}
}
