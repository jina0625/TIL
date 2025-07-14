package step07;

public class Animal {
	// 부모 클래스의 필드
	String name;
	int age;
	
	// Animal 클래스의 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("이름 : " + this.name + "\n나이 : " + this.age);
	}
	
	public void eat() {
		System.out.println(name + "가 밥을 먹습니다.");
	}
}
