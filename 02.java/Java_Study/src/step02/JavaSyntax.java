package step02;

import java.util.Scanner;

public class JavaSyntax {

	public static void main(String[] args) {

		int a; // 변수 선언만 한 상태
		int b = 10; // 변수 선언 + 초기화
		a = 11; // 변수 초기화
		System.out.println(a);
		System.out.println(b);
		
		System.out.printf("이름: %s%n", "코친이");
		System.out.printf("나이: %d\n", 21);
		System.out.printf("취미: %s", "코딩");
		
		System.out.println();
		
		System.out.printf("이름: %s%n나이: %d\n취미: %s", "코친이", 21, "코딩" );

		// 플래그
		System.out.printf("%7d%n", 11111); // 오른쪽 정렬
		System.out.printf("%-7d%n", 11111); // 왼쪽 정렬
		System.out.printf("%07d%n", 11111); // 빈자리 0으로 채움
		System.out.printf("%,7d%n", 11111); // 천 단위 구분 기호 넣고 빈자리 공백으로 채움

		System.out.printf("%.4f", 123.45f); // 소수점 이하 4자리 출력

		// 산술 연산자
		System.out.println(100 + 3);
		System.out.println(100 - 3);
		System.out.println(100 * 3);
		System.out.println(100 / 3);
		
		int c = 100;
		int d = c + 3;
		System.out.println(d);
		
		int e = 100;
		int f = 3;
		int add = e + f;
		int sub = e - f;
		int mul = e * f;
		int div = e / f;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		System.out.println(123 + 4);
		System.out.println("123" + 4); // 문자열을 하나로 연결
	
		int age = 21;
		System.out.println("나는 올해 " + age + "살입니다.");
		
		Scanner scan = new Scanner(System.in);
		int scanA = scan.nextInt();
		int scanB = scan.nextInt();
		int add2 = scanA + scanB;
		int sub2 = scanA - scanB;
		int mul2 = scanA * scanB;
		int div2 = scanA / scanB;
		System.out.println("덧셈 결과 : " + add2);
		System.out.println("뺄셈 결과 : " + sub2);
		System.out.println("곱셈 결과 : " + mul2);
		System.out.println("나눗셈 결과 : " + div2);
		
		// 묵시적 형변환
		int x = 1;
		char y = '1'; // 아스키코드 49
		int z = x + y;
		System.out.println(z);
		
	}

}
