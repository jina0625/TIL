// 도메인 모델 (Domain Model)
package model.domain;

public class People {
	/* 캡슐화 Capsulation
	 * 		: 객체 멤버변수에 직접적으로 외부에서 접근 X (객체 보호)
	 * 
	 * 		1) private : 동일 클래스 내에서만 접근 가능 (집 개인 화장실)
	 * 		2) default : 동일 패키지 내에서만 접근 가능
	 * 		3) protected : 동일 패키지 + 다른 패키지 하위 클래스에서 접근 가능 (호텔 화장실)
	 * 		4) public : 접근 제한 X (공중 화장실)
	 */
	
	private String name;
	private int age;
	
	public People() {}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
