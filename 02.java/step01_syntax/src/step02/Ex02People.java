package step02;

class People2{
	// 인스턴스 변수
	String name = "Java";
	int age = 28;
	
	// 기본 생성자
	// 		기본 생성자만 사용 시 : 생략되어도 프로그램 내부에서 자동으로 생성
	People2() {}
	
	// 사용자 정의 생성자 -> 인스턴스 생성과 동시에 원하는 값으로 초기화 가능 (기본 생성자 직접 선언 사용)
	// 생성자 오버로딩 overloading : 생성자를 두 개 이상 구현하는 경우
	People2(String name) {
		this.name = name;
	}
	
	People2(int age) {
		this.age = age;
	}
	
	People2 (String name, int age) {
		this.name = name;
		
		if(age >= 0) {
			this.age = age;
		}
	}
	
	// 메소드
	String getName () {
		return name;
	}
	
	int getAge () {
		return age;
	}
	
	void printInfo () {
		System.out.println(name + " " + age);
	}
	
	// 나이값에 음수가 지정안되는 메소드 만들기
	void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} else {
			System.out.println("음수값은 나이로 지정될 수 없음");
		}
	}
	
}
public class Ex02People {
	public static void main(String[] args) {

		People2 dev = new People2("dev", 25);
		People2 it = new People2("it", 26);
		
		// 1. dev, it : 같은 타입 (같은 클래스 사용)
		// 2. dev, it : 같은 객체 X (주소 값 다름)
		// System.out.println(dev);		// step02.People2@15db9742
		// System.out.println(it);		// step02.People2@6d06d69c
	
	
		// 3. 객체 정보 보호
		// 		1) 생성자
		People2 devops = new People2("devops", 27);
		System.out.println(devops.age); 	// 27
		
		//		2) 메소드
		devops.setAge(-22);
		System.out.println(devops.getAge()); 	// 음수값은 나이로 지정될 수 없음
		
	
	}

}
