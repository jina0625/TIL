package step08;

public class MainInterface {

	public static void main(String[] args) {
		// 입출금 계좌 객체 생성
		CheckingAccountInterface myCheckingInterface = new CheckingAccountInterface("123-4567890", 100000, 0.02);
		myCheckingInterface.displayAccountInfoInterface();
		myCheckingInterface.withdrawInterface(100000);
		myCheckingInterface.depositInterface(50000);
		myCheckingInterface.displayAccountInfoInterface();
		
		System.out.println();
		
		// 적금 계좌 생성 (이자율 5%, 매월 50,000원 적금)
		SavingAccount mySavingAccount = new SavingAccount("987-6543210", 0, 0.05, 50000);
		mySavingAccount.addMonthlyDeposit(); // 매월 적금액 추가
		mySavingAccount.addInterest(); // 이자 계산 및 추가
		mySavingAccount.displayAccountInfoInterface();
	}
}
