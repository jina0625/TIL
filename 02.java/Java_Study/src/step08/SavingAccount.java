package step08;

public class SavingAccount implements BankAccountInterface, InterestBearing{
	String accountNumberInterface;
	double balanceInterface;
	double interestRate;
	double monthlyDeposit; // 매월 적금액

	public SavingAccount(String accountNumberInterface, double initialBalanceInterface, double interestRate, double monthlyDeposit) {
		this.accountNumberInterface = accountNumberInterface;
		this.balanceInterface = initialBalanceInterface;
		this.interestRate = interestRate;
		this.monthlyDeposit = monthlyDeposit;
	}
	
	// 입금 메서드 구현
		public void depositInterface(double amount) {
			if (amount > 0) {
				balanceInterface += amount;
				System.out.println(amount + "원이 입금됐습니다.");
				System.out.println("잔액 : " + balanceInterface + "원");
			} else {
				System.out.println("입금액은 0보다 커야 합니다.");
			}
		}
		
		// 출금 메서드 구현
		public void withdrawInterface(double amount) {
			System.out.println("적금 계좌에서는 출금할 수 없습니다.");
		}
		
		// 계좌 정보 출력 메서드 구현
		public void displayAccountInfoInterface() {
			System.out.println("계좌 번호 : " + accountNumberInterface);
			System.out.println("잔액 : " + balanceInterface + "원");
			System.out.println("이자율 : " + (interestRate * 100) + "%");
			System.out.println("매월 적금액 : " + monthlyDeposit + "원");
		}
		
		
		// 이자 계산 메서드 구현
		public void addInterest() {
			double interest = balanceInterface * interestRate;
			balanceInterface += interest;
			System.out.println("이자 " + interest + "원이 추가됐습니다.");
		}
	
		// 매월 적금액 추가 메서드
		public void addMonthlyDeposit() {
			balanceInterface += monthlyDeposit;
			System.out.println("매월 " + monthlyDeposit + "원을 입금합니다.");
		}
}