package step08;

public abstract class BankAccount {
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double initailBalance) {
		this.accountNumber = accountNumber;
		this.balance = initailBalance;
	}
	
	// 추상 메서드 (입출금 메서드)
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	
	//계좌 정보 출력 메서드
	public void displayAccountInfo() {
		System.out.println("계좌 번호 : " + accountNumber);
		System.out.println("잔액 : " + balance + "원");
	}
}
