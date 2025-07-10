package step07;

public class Dog extends Animal{
	String breed;
	
	public void roll() {
		System.out.println(name + "가 바닥을 구릅니다.");
	}
	
	public void roll(int times) {
		System.out.println(name + "가 바닥을 " + times + "번 구릅니다.");
	}
}
