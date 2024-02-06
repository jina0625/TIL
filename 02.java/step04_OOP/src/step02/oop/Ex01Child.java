package step02.oop;

class Parent {
	String name;
	int age;
	
	public Parent() {
		System.out.println("부모 생성자");
	}
	
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.print(name);
		System.out.print(age);
	}
}

class Child extends Parent {
	
	String wish;
	
	public Child() {
//		super(); 	// 부모 생성자 호출 (생략 가능)
		System.out.println("자식 생성자");
	}
	
	// 사용자 정의 생성자
	public Child(String name, int age, String wish) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.wish = wish;
	}
	
	public void printInfo2() {
		super.printInfo();
		System.out.print(wish);
	}
}


public class Ex01Child {
	public static void main(String[] args) {
		Child child = new Child();
		child.name = "java";
		child.age = 28;
		child.wish = "game";
		
		child.printInfo();		// java28
		System.out.println();
		// printInfo2 호출 시 -> name, age 모두 출력
		//						=> super 통해 호출 가능
		child.printInfo2(); 	// java28game
		
		// 1. super() 생략 가능 -> 기본 생성자에서만 생략 가능
		// 2. 부모 사용자 정의 생성자 활용
		// 3. ** 단일 상속(하나의 부모만 상속)만 가능
		Child child2 = new Child("oop", 25, "study");
		child2.printInfo2(); 	// java28gameoop25study
		
		// 다형성 : 부모와 자식이 상속 관계 있을 때, 자식은 부모 타입으로 생성 가능
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent c2 = new Child(); 	// 자동 타입 변환
		
		// c2.printInfo2(); -> 부모에 속해있는 객체이므로 사용 X (사용하려면 자식 타입으로 다시 형변환 필요)
		
		Child c3 = (Child)c2;	// 강제 타입 변환
		c3.printInfo2();
		
		// 부모 객체는 자식 타입으로 생성 불가
		// Child p2 = new Parent(); 	// 생성 불가
	}

}
