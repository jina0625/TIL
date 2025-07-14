package step07;

public class Student extends Person {
	int grade;
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public void gradeInfo() {
		System.out.println("현재 대학교 " + grade + "학년이야.");
	}
}
