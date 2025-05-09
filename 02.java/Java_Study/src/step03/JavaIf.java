package step03;

import java.util.Scanner;

public class JavaIf {

	public static void main(String[] args) {
		
		// if-else문
		int score = 80;
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else {
			System.out.println("A학점이 아닙니다.");
		}
		
		// else if문
		int score1 = 80;
		if (score1 >=90) {
			System.out.println("A학점입니다.");
		} else if (score1 >= 80 && score1 < 90) {
			System.out.println("B학점입니다.");
		} else if (score1 >= 70 && score1 < 80) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}
		
		// 중첩 조건문
		System.out.println("학년을 입력하세요.");
		Scanner scanGrade = new Scanner(System.in);
		int grade = scanGrade.nextInt();
		if (grade ==4) {
			System.out.println("점수를 입력하세요.");
			Scanner scanScore = new Scanner(System.in);
			int score2 = scanScore.nextInt();
			if (score2 >= 90) {
				System.out.println("장학금 지급 대상입니다.");
			} else {
				System.out.println("장학금 지급 대상이 아닙니다.");
			}
		}else {
			System.out.println("장학금 지급 학년이 아닙니다.");
		}
		
		//switch문
		System.out.println("알파벳을 입력하시요. (예 : a, b, c 등)");
		Scanner scanAlphabet = new Scanner(System.in);
		String alphbet = scanAlphabet.next();
		switch (alphbet) {
			case ("a"):
				System.out.println("A");
				break;
			case ("b"):
				System.out.println("B");
				break;
			case ("c"):
				System.out.println("C");
				break;
			default:
				System.out.println("일치하는 알파벳이 없습니다.");
			break;
		} 
	}
	

}
