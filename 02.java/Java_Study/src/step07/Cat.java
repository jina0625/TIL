package step07;

public class Cat extends Animal{
	
	public void rub() {
		System.out.println(name + "가 몸을 비빕니다.");
	}
	
	@Override // 오버라이딩 애너테이션
	public void eat() {
		System.out.println(name + "가 닭고기를 먹습니다.");
	}
}
