package step07;

public class Cat extends Animal{
	
	// Cat 클래스의 생성자
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void rub() {
		System.out.println(name + "가 몸을 비빕니다.");
	}
	
	@Override // 오버라이딩 애너테이션
	public void eat() {
		super.eat();
		System.out.println(name + "가 닭고기를 먹습니다.");
	}
}
