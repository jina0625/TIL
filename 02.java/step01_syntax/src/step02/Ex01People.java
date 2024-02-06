package step02;

/* - 설계 : People
 * 		1. 속성 : name , age
 * 		2. 기능 : name, age 출력(반환) / 일반 정보 출력
 * 
 * - 개발
 * 		1. 데이터 타입 구별
 * 		2. 기능 정의 -> 객체 생성
 */

class People {
	// 인스턴스 변수 -> 클래스 영역에 선언
	String name = "Java";
	int age = 28;
	
	People() {}
	/* 기본 생성자 : 클래스 이름() {}
 	 * 		1) 클래스 이름과 같아야 함
	 * 		2) 리턴 값 X (void 안 붙임)
	 * 		3) 모든 클래스는 반드시 생성자 가져야 함
	 */
	
	/* 메소드 : 메소드 이름 { // 선언부
	 * 		// 구현부
	 * }
	 */
	
	// 이름 반환 메소드
	String getName() {
		return name;
	}
	
	// 나이 반환 메소드
	int getAge() {
		return age;
	}
	
	// 일반 정보(name, age) 출력 메소드
	void printInfo () {
		System.out.println(name + " " + age);
	}
	
	
}

public class Ex01People {
	public static void main(String[] args) {

		People p1 = new People();
		System.out.println(p1.name); 		// Java
		System.out.println(p1.age); 		// 28
		System.out.println(p1.getAge()); 	// 28
		
		p1.printInfo(); 	// Java 28
		
	}

}
