package generic.basic01;

public class ABC <T> /*type*/  { 	// 제널릭 클래스

	private T t;


	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}
