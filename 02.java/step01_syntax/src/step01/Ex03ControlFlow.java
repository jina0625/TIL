package step01;

public class Ex03ControlFlow {

	public static void main(String[] args) {
		// 조건문
		// 1. if문
		
		/*	if(조건식) {
		 * 		조건식 결과 참일 때 실행하고자 하는 명령문;
		 * 	}else {
		 * 		조건식 결과 거짓일 때 실행하고자 하는 명령문;
		 * 	}
		 */
	
		// if / else if/ else문 
		//		: else if문은 여러 번 나와도 상관 X / if문, else문 단 한번만 나올 수 있음
		
		// 관리자 id(String)가 admin 일때 -> "접속성공"/ "접속실패"
		
		String id = "admin";
		if(id == "admin") {
			System.out.println("접속성공");
		}else {
			System.out.println("접속실패");
		}
		
		// 2. switch / case
		
		/* switch(조건) {
		 * 		case 1 :
		 *  			조건이 값1일 때 실행하고자 하는 명령문;
		 *  			break;
		 *  	case 2 :
		 *  			조건이 값2일 때 실행하고자 하는 명령문;
		 *  			break;
		 *  	...
		 *  	default :
		 *  			조건이 어떠한 case절에도 해당하지 않을 때 실행하고자 하는 명령문;
		 *  			break;
		 */
		
		// break 키워드 없을 시 조건에 해당하는 switch문 case절 이후 모든 case절 전부 실행 (반드시 break 키워드 포함해야함)
		
		// 1. -> 고객상담, 2. -> 가게 연결, 3. -> 다시듣기, 4. -> 종료
		int num = 3;
		switch(num) {
			case 1 :
					System.out.println("고객상담");
					break;
			case 2 :
				System.out.println("가게 연결");
				break;
			case 3 :
				System.out.println("다시듣기");
				break;
			case 4 :
				System.out.println("종료");
				break;
			default :
					System.out.println("오류");
					break;
		}
		
		
		// 반복문
		// 1. for
		//		- 반복 횟수 정해진 경우
		//		- 배열과 함께 주로 많이 사용
		
		/* for (초기식; 조건식; 증감식) {
		 * 		조건식 결과 참인 동안 반복적으로 실행하고자 하는 명령문; 
		 * }
		 */
		
		// 1 ~ 20 출력 (짝수만 출력)
		for(int i = 1; i <= 20; i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		
		// 향상된 반복문
		//	  - 배열 인덱스 문제 해결 (ArrayIndexOutOfBoundsException 예외를 피할 수 있음)
		
		/* for(타입 변수명 : 배열 변수명) {
		 * 
		 * }
		 */
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		for(int i : arr1) {
			System.out.println(i);
		}
		
		
		// 참조타입 배열 : 문자열
		String[] alphabet = {"a", "b", null, "d", "e"};
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
		
		for(String alpha : alphabet) {
			System.out.println(alpha);
		}
		
		
		// 2. while
		//		- 무한 루프나 특정 조건 만족할 때까지 반복해야하는 경우
		//		- 주로 파일 읽고 쓰기에 많이 사용
		
		
		/*	 while(조건식) {
		 *  	조건식 결과 참인 동안 반복적으로 실행하고자 하는 명령문;
		 *  }
		 */
		
	}

}
