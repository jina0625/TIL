package step07;

public class Dog1 extends Animal1{
	// 자식 클래스의 필드 (부모 클래스와 동일한 이름)
	String name = "강아지";
	public void displayNames() {
		// 자식 클래스의 name 필드 출력
		System.out.println("자식 클래스의 name : " + this.name);
		// 부모 클래스의 name 필드 출력
		System.out.println("부모 클래스의 name : " + super.name);
	}
}
