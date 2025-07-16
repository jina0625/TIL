package step08;

public class CheckingAccountInterface implements BankAccountInterface, InterestBearing{
	// 필드
	String accountNumberInterface;
	double balanceInterface;
	double interestRate; // 이자율
	
	// 생성자
	public CheckingAccountInterface(String accountNumberInterface, double initialBalanceInterface, double interestRate) {
		this.accountNumberInterface = accountNumberInterface;
		this.balanceInterface = initialBalanceInterface;
		this.interestRate = interestRate; // 이자율 초기화
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
		if (amount > 0 && balanceInterface >= amount) {
			balanceInterface -= amount;
			System.out.println(amount + "원이 출금됐습니다.");
			System.out.println("현재 잔액 : " + balanceInterface + "원");
		} else {
			System.out.println("잔액이 부족해 출금할 수 없습니다.");
		}
	}
	
	// 계좌 정보 출력 메서드 구현
	public void displayAccountInfoInterface() {
		System.out.println("계좌 번호 : " + accountNumberInterface);
		System.out.println("잔액 : " + balanceInterface + "원");
		System.out.println("이자율 : " + (interestRate * 100) + "%");
	}
	
	
	// 이자 계산 메서드 구현
	public void addInterest() {
		double interest = balanceInterface * interestRate;
		balanceInterface += interest;
		System.out.println("이자 " + interest + "원이 추가됐습니다.");
	}
}