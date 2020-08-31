package generic.basic02;

public class Basic <K, V> { //< , > multi generic

	// 멀티 제네릭
	
	private K key;
	private V value;
	
	public void put(K key, V value) {		//set메서드
		this.key= key;
		this.value = value;
		
	}
	public V get(K key) {		//get 메서드
		return value;
		
	}// toString 오버라이딩
	@Override
	public String toString() {
		
		return "(" +key+ " = " +value +")";
	}
	

}
