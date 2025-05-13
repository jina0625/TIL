package step04;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		// 음료 자판기 프로그램
		Scanner scan = new Scanner(System.in);
		int cash = 0;
		int number = 0;

		System.out.println("*** 자판기 프로그램을 시작합니다. ***");

		while (true) {
			System.out.print("얼마를 투입하겠습니까? : ");
			int inputCash = scan.nextInt();
			cash += inputCash;

			while (true) {
				System.out.println("현재 투입된 금액 : " + cash + "원");
				System.out.println("1. 콜라 (1,500원)\n2. 오렌지주스 (2,000원)\n3. 생수 (1,000원)\n4. 종료");
				System.out.print("음료를 고르세요. (번호 입력): ");

				// 숫자 유효성 검사
				if (!scan.hasNextInt()) {
					System.out.println("숫자를 입력해주세요.");
					scan.next(); // 입력 버퍼 제거
					continue;
				}

				number = scan.nextInt();

				switch (number) {
					case 1:
						while (cash < 1500) {
							System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
							System.out.print("얼마를 추가로 투입하겠습니까? : ");
							cash += scan.nextInt();
						}
						cash -= 1500;
						System.out.println("콜라가 나왔습니다. 남은 금액 : " + cash + "원");
						break;

					case 2:
						while (cash < 2000) {
							System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
							System.out.print("얼마를 추가로 투입하겠습니까? : ");
							cash += scan.nextInt();
						}
						cash -= 2000;
						System.out.println("오렌지주스가 나왔습니다. 남은 금액 : " + cash + "원");
						break;

					case 3:
						while (cash < 1000) {
							System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
							System.out.print("얼마를 추가로 투입하겠습니까? : ");
							cash += scan.nextInt();
						}
						cash -= 1000;
						System.out.println("생수가 나왔습니다. 남은 금액 : " + cash + "원");
						break;

					case 4:
						System.out.println("프로그램을 종료합니다. 남은 금액 " + cash + "원이 반환됩니다.");
						scan.close();
						return;

					default:
						System.out.println("1~4번 중 다시 입력해주세요.");
						continue;
				}
			}
		}
	}
}
