package chap21.lab;

//class가 3개 public class(main), class BankAccount, class Exception
class NegativeBalanceException extends Exception{
	public NegativeBalanceException() {
		super("잔액이 부족합니다.");
	}
}
class BankAccount{
	private int balance; // 잔액
	
//	public int getBalance() {
//		return balance;
//	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	public void deposit(int money) { // 저축
		balance += money;
	}
	public void withdraw(int money) throws NegativeBalanceException{ // 출금
		if(balance < money)
			throw new NegativeBalanceException();
		balance -= money;
	}	
}


public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposit(10000);
		try {
			ba.withdraw(20000);
		} catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	// = 
//	public static void main(String[] args) throws NegativeBalanceException{
//		BankAccount ba = new BankAccount();
//		ba.deposit(10000);
//	}
}
