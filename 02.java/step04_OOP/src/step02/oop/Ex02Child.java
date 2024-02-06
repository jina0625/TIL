package step02.oop;

class Parent2 extends Object {
	String name;
	int age;
	
	Parent2() {
		super();
	}
	
	void pirntAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Child2 extends Parent2 {
	String wish;
	
	public Child2() {
		super();
	}

	void printAll() {
		super.pirntAll();
		System.out.println(wish);
	}
	
	// 다형성 적용 메소드
	static Object toDo() {
		return "Study";
	}
	
	static Object toDo2() {
		return "Study,Exercise,Cleaning,Sleeping";
	}
}


public class Ex02Child {
	public static void main(String[] args) {

	// 1. y만 출력하기 : toDo() 메소드 이용 - charAt()
	System.out.println(((String) Child2.toDo()).charAt(4));

	// 2. Study 문자열을 char[] 배열로 저장해 출력하기
	/* step1
	 * 		- toDo2() 반환값을 , 를 기준으로 String[] toDoLists 배열에 저장
	 * 		- 반환값 -> 변환(String) -> 배열로 변환
	 * 
	 * hint : charAt() / length() / split()
	 * 
	 * step2
	 * 		- toDoLists 첫번째 index에 저장된 Study라는 문자열을 새롭게 생성한 char[] cArray 배열에 저장 후 출력
	 */
		
	System.out.println("======= step1 결과값 =========");
	String[] toDoLists = ((String) Child2.toDo2()).split(",");
		for(String toDoList : toDoLists) {
			System.out.println(toDoList); 	// Study // Exercise // Cleaning // Sleeping
		}
		
	System.out.println("======= step2 결과값 =========");
	char[] cArray = new char[toDoLists[0].length()];
	for(int i = 0; i < cArray.length; i++) {
		cArray[i] = toDoLists[0].charAt(i);
	}
	
	for(char character : cArray) {
		System.out.println(character); 	// S // t // u // d // y
	}
		
	}

}
