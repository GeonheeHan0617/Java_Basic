package exception.thorwsex;

public class Account {

	/*
	 * 1. 잔액 (balance : long ) 으로 맴버변수를 선언 private 재한자 
	 * 2. deposit 입금기능
	 * 		withDraw 출금기능
	 * 		getBalance : long 잔액확인 기능
	 * 
	 * 3. 출금 기능에서 잔액이 출금금액보다 작다면 예외를 발생시키는 코드를 작성하시오.
	 * 
	 */
	
	
	
	
	private long balance;
	
	public Account() {
		
	}
	
	public void deposit(int m) throws Exception{
		
		if(balance <m) {
			throw new MyException("입금 금액:" + (m +balance));
		}
		
		this.balance += m;
		
	}
	public void withDraw(int m) throws MyException {
		
		if (balance <m) {
			throw new MyException("잔액 부족" + (m -balance));
		}
		
		this.balance -= m;
		
	}
	public long getBalance()throws Exception {
		return balance;
	}
	
}
