package step04;

import java.util.Scanner;

public class JavaFor {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int value = 0;
		for (int i = 1; i <= 9; i++) {
			value = i * 3;
			System.out.println("3 X " + i + " = " + value);
		}
		
		int num = 0;
		Scanner scanNum = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		int dan = scanNum.nextInt();
		for (int i = 1; i <= 9; i++) {
			num = dan * i;
			System.out.println(dan + "x" + i + " = " + num);
		}
		
		// 중첩 반복문
		for (int i = 1; i <= 9; i++) {
			int number;
			System.out.println("---" + i + "단");
			for (int j = 1; j <= 9; j++) {
				number = i * j;
				System.out.println(i + "x" + j + "=" + number);
			}
		}
		
		// for문으로 구구단 프로그램 만들기
		System.out.println("*** 구구단 프로그램을 시작합니다. ***");
		System.out.println("종료하려면 0을 입력하세요.");
		while(true) {
			int value1;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("몇 단을 출력할까요?");
			int dan1 = scan1.nextInt();
			if (dan1 == 0) {
				break;
			}
			for (int i = 1; i <= 9; i++) {
				value1 = dan1 * i;
				System.out.println(dan1 + "x" + "=" + value1);
			}
		}
		System.out.println("*** 구구단 프로그램을 종료합니다 ***");
	

	}
	

}
