package step01;

public class Ex03Exception {
	
	public static void throwingTest() throws Exception {
		System.out.println("예외 발생 테스트"); 	// java.lang.Exception 자바에서 예외처리 할 수 있게 제공해주는 최상위 부모 클래스
		throw new Exception();
	}
	
	
	public static void main(String[] args) {
		try {
			throwingTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
