package step07;

public class Dog extends Animal{
	String breed;
	
	// Dog 클래스의 생성자
	public Dog(String name, int age, String breed) {
		super(name, age); // 부모 클래스의 생성자 호출
		this.breed = breed;
		System.out.println("품종 : " + this.breed);
	}
	
	public void roll() {
		System.out.println(name + "가 바닥을 구릅니다.");
	}
	
	public void roll(int times) {
		System.out.println(name + "가 바닥을 " + times + "번 구릅니다.");
	}
}
