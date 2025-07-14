package step07;

public class Main1 {

	public static void main(String[] args) {
		Dog1 myDog1 = new Dog1();
		// 자식 클래스와 부모 클래스의 필드 출력
		myDog1.displayNames();
		// 부모 클래스의 메서드 호출 (부모 클래스의 name 필드 사용)
		myDog1.printName();
	}

}
