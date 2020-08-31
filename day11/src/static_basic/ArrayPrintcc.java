package static_basic;

public class ArrayPrintcc {

	//1. 외부에서 객체를 생성할 수 없도록 접근제한자를 붙이세요.
	//2. 객체를 생성하지 않고 메서드를 사용하도록 static을붙이세요.
	
	private ArrayPrintcc() {
		
	}
	
	
	public static String printArraycc(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	
	public static String printArraycc(int[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	public static String printArraycc(char[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		
		return result;
	}
	
	
	
	
}
