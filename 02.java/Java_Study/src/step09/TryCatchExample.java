package step09;

public class TryCatchExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(100000);
		try {
			account.deposit(50000);
			account.withdraw(200000);
		} catch (LowBalanceException e) {
			System.out.println("오류 : " + e.getMessage());
		} finally {
			System.out.println("현재 잔액 : " + account.getBalance() + "원");
		}
	}

}
