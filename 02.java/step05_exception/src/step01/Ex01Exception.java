package step01;

class A {}
class B extends A{}
class C extends A{}

public class Ex01Exception {
	public static void main(String[] args) {
		//NPE(NullPointException) : null 값을 참조하려 할 때 발생
		String str1 = null;
//		System.out.println(str1.length()); ->  NullPointerException
		
		// NumberFormatException : 숫자 형식 오류
		String str2 = "three";
//		System.out.println(Integer.parseInt(str2)); -> NumberFormatException
		
		// ClassCastException : 특정 클래스 객체를 호환되지 않는 다른 클래스 객체로 변환하려고 할 때 발생
		A b = new B();
//		C c = new B();  -> Type mismatch: cannot convert from B to C
		
		// ArithmeticException : 예외적인 산술 조건 발생 시 
//		System.out.println(10 / 0); 	-> ArithmeticException
		
		
		
	}

}
