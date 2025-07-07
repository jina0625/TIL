package step06;

public class AccessExampleMain {

	public static void main(String[] args) {
		AccessExample ae = new AccessExample();
		ae.publicMethod();
		ae.protectedMethod();
		ae.defaultMethod();
//		ae.privateMethod(); 같은 클래스 아니라서 접근 불가
	}

}
