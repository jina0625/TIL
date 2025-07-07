package step06;

public class Calculator {
	public static int count = 0;
	public static int add(int a, int b) {
		count++;
		return a + b;
	}
	public void printCount() {
		System.out.println("메서드가" + count + "번 호출됐습니다.");
	}
}
