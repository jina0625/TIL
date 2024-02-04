package step02;

class A {
	A() {
		System.out.println("Class A");
	}
}

class B {
	A a = new A (); // 인스턴스 변수
	B() {
		System.out.println("Class B");
	}
}


public class Ex03Object {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		// B타입 b 객체 생성 완료 시점?
		//		: 객체가 보유하고 있는 모든 인스턴스 변수들이 메모리에 생성된 이후 객체 생성 완료
		
	}

}
