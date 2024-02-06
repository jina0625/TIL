package step02.oop;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// equals() 재정의 : 논리적 동일성을 비교시 사용
	@Override
	public boolean equals(Object obj) {
		// Person 이름, 나이 비교
		// 1. 형변환
		// instanceOf :  참조변수가 참조하고 있는 실제 인스턴스 타입을 알아보기 위해 사용
		if(obj instanceof Person) {
			Person p = (Person)obj;
		// 2. 조건 : 이름 , 나이 같다면
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class Ex04Overriding {
	public static void main(String[] args) {
		Person p = new Person("java", 28);
		Person p1 = new Person("java", 28);
		Person2 p2 = new Person2("jaava", 28);
		
		// p - p1
		System.out.println(p.equals(p1)); 	// true
		
		// p - p2
		System.out.println(p.equals(p2)); 	// false
	}

}
