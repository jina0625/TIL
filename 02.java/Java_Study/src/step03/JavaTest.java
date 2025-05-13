package step03;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		// 정수와 실수를 하나씩 입력받아 두 수로 사칙연산 수행하고 결과 출력하는 코드 작성
		int num = 0;
		double number = 0;
		
		Scanner numScan = new Scanner(System.in);
		System.out.println("정수를 입력하세요. -->");
		num = numScan.nextInt();
		
		Scanner numberScan = new Scanner(System.in);
		System.out.println("실수를 입력하세요. -->");
		number = numberScan.nextDouble();
		
		System.out.println("덧셈 결과(정수) :" + (num + (int)number));
		System.out.println("뺄셈 결과(실수) :" + (num - number));
		System.out.println("곱셈 결과(실수) :" + (num * number));
		System.out.println("나눗셈 결과(정수) :" + (num / (int)number));
		
		
	}

}
