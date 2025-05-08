package step01;

import java.io.IOException;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) throws IOException {
		
		//	System.out.print() : 줄 바꾸지 않고 출력
		//	\n : 개행문자, 줄 바꿈 문자

		System.out.print("Hello\n");
		System.out.print("Java\n");

		// System.out.println() : 출력하고 자동 줄 바꿈
		System.out.println("Hello");
		System.out.println("Java");
		
		// System.in.read() : 입력받기 (1바이트만 읽어옴), 예외 처리 필수, 아스키 코드로 출력
		System.out.println((char)System.in.read());
		
		// Scanner 클래스 : 입력받기 (2바이트 이상 입력 받을 시), 예외 처리 안해도 오류 발생 X
		Scanner scan = new Scanner(System.in);
		// nextLine() : enter 누르기 전까지 입력한 내용 전체 그대로 출력
		System.out.println(scan.nextLine());
		// next() : 공백 문자 전까지만 출력
		System.out.println(scan.next());
		scan.close(); // 자원 낭비 예방
		
	}
	
	
}
