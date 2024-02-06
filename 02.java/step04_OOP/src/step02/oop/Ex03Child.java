package step02.oop;

class Parent3 {
	String name;
	
	// 오버라이딩 : 부모 클래스로부터 상속받은 메서드의 내용을 재정의(변경) 하는 것
	@Override 	// 상위 타입 (부모 타입) 메서드 재정의 의미
	public String toString() {
		return "name : " + name;
	}
}

class Child3 extends Parent3{
	String wish;
	
	@Override // 상위 타입 (부모 타입) 메서드 재정의 의미
	public String toString() {
		return "name : " + super.name + " " + "wish : " + wish;
	}
}
public class Ex03Child {
	public static void main(String[] args) {

		Parent3 p3 = new Parent3();
		p3.name = "java";
		System.out.println(p3); 	// name : java
		
		Child3 c3 = new Child3();
		c3.name = "java3";
		c3.wish = "dev";
		System.out.println(c3); 	// name : java3 wish : dev
	}

}
