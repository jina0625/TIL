package step09;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요. --> ");
		int a = scan.nextInt();
		System.out.println("두 번째 정수를 입력하세요. --> ");
		int b = scan.nextInt();
		try{
			if (b == 3) {
				throw new ArithmeticException("3으로 나눌 수 없습니다!");
			}
			int result = a / b;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		try {
			System.out.println("나이를 입력하세요 : ");
			int age = scan1.nextInt();
			if (age < 0 || age > 100) {
				throw new IllegalArgumentException("나이는 0보다 크고 100보다 작아야 합니다.");
			}
			System.out.println("입력된 나이 : " + age);
		} catch (IllegalArgumentException e) {
			System.out.println("오류 : " + e.getMessage());
		} finally {
			scan1.close();
			System.out.println("프로그램이 종료됩니다.");
		}
	}

}
