package step07;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
	}
}
