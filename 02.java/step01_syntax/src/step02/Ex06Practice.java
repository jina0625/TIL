package step02;

import model.domain.People;

public class Ex06Practice {

	// Q1.
	/* 매개변수로 들어오는 값 비교해 같을 경우 true 반환하는 메소드 개발
	 * 		메소드 명 : checkAdmin , 반환값 : boolean / static
	 * 개발 후 실행결과 확인
	 * step 01 -> Condition의 if문 활용해 메소드 개발
	 * 			-> 입력 id값이 admin1 or admin2일때 "관리자 접속 성공" 문자열 출력
	 * 			-> 실패 시 " 관리자 접속 실패" 문자열 출력
	 */
	
	static boolean checkAdmin (String id) {
		if (id == "admin1" || id == "admin2") {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Q2.
	/* 매개변수로 들어오는 값 비교해 월(~4월까지만) 확인 메소드 개발
	 * 		함수명 : checkMonth , 반환값 X, static
	 * step01 -> Condition의 switch / case문 활용해 메소드 개발
	 */
	
//	static void checkMonth (int month) {
//		switch (month) {
//			case 1 :
//				System.out.println("1월");
//				break;
//			case 2 :
//				System.out.println("2월");
//				break;
//			case 3 :
//				System.out.println("3월");
//				break;
//			case 4 :
//				System.out.println("4월");
//				break;
//			default :
//				System.out.println("해당 월 존재 x");
//				break;
//		}
		
		
		// Q2-1) for문으로 바꿔보기
		static void checkMonth (int month) {
			for (int i = 0; i <= 4; i++) {
				if (month == 1) {
					System.out.println("1월");
					break;
				} else if (month == 2) {
					System.out.println("2월");
					break;
				} else if (month == 3) {
					System.out.println("3월");
					break;
				} else if (month == 4) {
					System.out.println("4월");
					break;
			} else {
				System.out.println("해당 월 존재 X");
				break;
			}
		}
	}	
		
	// Q3.
	/* printPeopleName 메소드 개발
	 * 		printPeopleName(People[] v) {} -> 배열 내부 모든 사람 이름 출력 (name 변수는 직접적인 접근 불가)
	 * 		private -> getName() 호출 가능 : public - for문 활용해 출력 (호출만으로 이름 출력하기)
	 */
			
	static People[] peopleArray() {
		People p1 = new People("Java", 28);
		People p2 = new People("Java", 28);
		People[] v = {p1, p2};
		return v;
	}
	
	public static void printPeopleName(People[] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i].getName());
		}
	}
		
		
	
	
	public static void main(String[] args) {

	// Q1.
		String id = "admin3";
				
		boolean result = checkAdmin(id);
		
		if(result) {
			System.out.println("관리자 접속 성공");
		} else {
			System.out.println("관리자 접속 실패");
		}
		
		
	// Q2.
		int month = 5;
		checkMonth(month);
		
		
	// Q3.
		People[] v = peopleArray();
		printPeopleName(v);
		
		
	}

}
