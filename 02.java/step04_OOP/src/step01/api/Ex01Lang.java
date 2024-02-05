package step01.api;

class IT{
	public int num;
	
	public IT(int num) {
		this.num = num;
		System.out.println("IT" + num + "가 생성");
	}
	
	// 소멸
	public void finalize() {
		System.out.println("IT" + num + "가 제거");
	}
}

public class Ex01Lang {
	public static void main(String[] args) {
		// Object
		Object obj1 = new Object();
		
		// toString() : 객체가 가지고 있는 정보 or 값들을 문자열로 만들어 리턴하는 메소드
		System.out.println(obj1); 				// java.lang.Object@15db9742
		System.out.println(obj1.toString());	// java.lang.Object@15db9742
		
		// hashcode() : 객체를 식별하는 하나의 정수값
		System.out.println(obj1.hashCode()); 	// 366712642
		
		// equals()
		Object obj2 = new Object();
		System.out.println(obj2); 				// java.lang.Object@6d06d69c
		
		System.out.println(obj1.equals(obj2));	// false -> 비교하는 두 대상의 값을 비교 (String처럼 Class값 비교시 사용)
		System.out.println(obj1 == obj2);		// false -> 비교하는 두 대상의 주소값을 비교 (int와 boolean 같은 일반적 데이터 타입 비교)
		
		// String
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		String str4 = new String("String");
		
		// 내용값 비교 : equals
		System.out.println(str1.equals(str2)); 	// true
		System.out.println(str3.equals(str4));	// true
		System.out.println(str1.equals(str3)); 	// true
		
		System.out.println();
		
		// 주소값 비교 : ==
		System.out.println(str1 == str2); 	// true
		System.out.println(str3 == str4);	// false
		System.out.println(str1 == str3);	// false
		System.out.println(str1 == str4);	// false
		
		// System
		// getProperty() : 시스템 속성값 활용 (실행되는 곳의 정보를 얻어오거나 운영체제의 정보가 필요할 때 사용)
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.runtime.name"));
	
		// gc() : 가비지 컬렉터 직접 호출
		//		시스템에서 더이상 사용하지 않는 동적 할당된 메모리 블럭을 찾아 자동으로 다시 사용 가능한 자원으로 회수하는 것
		IT it;
		
		it = new IT(1);
		it = null;
		it = new IT(2);
		it = new IT(3);
		
		System.gc(); // IT1가 생성
					 // IT2가 생성
					 // IT3가 생성
					 // IT2가 제거
					 // IT1가 제거
		
		// charAt() : index값 통해 문자 뽑아주는 메소드
		String str5 = "Java API";
		System.out.println(str5.charAt(5)); 	// A
//		System.out.println(str5.charAt(8));		// 예외 : StringIndexOutOfBoundsException
		System.out.println(str5.length() -1);	// 7
		
		// length
		System.out.println(str5.length()); 		// 8
		
		// indexOf() : 문자열의 0번 index부터 특정 문자열 탐색
		System.out.println(str5.indexOf("a")); 	// 1
		
		// toUpperCase : 영문자를 모두 대문자로 변경
		// toLowerCase : 영문자를 모두 소문자로 변경
		System.out.println(str5.toUpperCase()); 	// JAVA API
		System.out.println(str5.toLowerCase()); 	// java api
		
		// substring() : 문자열 특정 부분 잘라내는 데 사용
		System.out.println(str5.substring(1,5)); 	// ava 
		System.out.println(str5.substring(1,5).length()); 	// 4
		
		// replace() : 문자열을 다른 문자열로 치환할 때 사용
		System.out.println(str5.replace("Java", "자바")); 	// 자바 API
		
		// trim() : 문자열 좌우에서 공백 제거
		String trimTest = " Java API    ";
		System.out.println(trimTest.trim()); 			// Java API
		System.out.println(trimTest.trim().length());	// 8
		
		// split() : 문자열 분할
		String splitTest = "Java-API-Split-Test";
		String[] splitArray = (splitTest.split(""));
		
		System.out.println(splitTest.split("-"));
		for (String str : splitArray) {
			System.out.println(str); 	// J // a // v // a // - // A // P // I // - // S // p // l // i // t // - // T // e // s // t
		}
		   
		// StringBuffer : 인스턴스는 값을 수정 or 추가 가능
		StringBuffer sb = new StringBuffer ("StringBuffer");
		System.out.println(sb); 	// StringBuffer
		
		// String vs StringBuffer
		// String -> 기존 String에 들어있던 값 버리고 새로 값 할당
		String string = "abc";
		// "def" 추가 출력
		System.out.println("before : " + string.hashCode()); 			// before : 96354
		string += "def";
		System.out.println("after :" + string.hashCode()); 				// after :-1424385949
		System.out.println(string); 		// abcdef
		
		StringBuffer stringBuffer = new StringBuffer ("adc");
		// 추가 : append()
		System.out.println("before : " + stringBuffer.hashCode()); 		// before : 1311053135
		stringBuffer.append("def");
		System.out.println("after : " + stringBuffer.hashCode()); 		// after : 1311053135
		System.out.println(stringBuffer); 	// adcdef
		
		// valueOf() : 기본타입 -> 문자열 반환 (괄호 안의 해당 객체를 String 객체로 변환)
		int i = 10;
		
		System.out.println(String.valueOf(i)); 		// 10 (문자열)
		
		// Wrapper : 8개 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스
		//		   ** int -> Integer / char -> Character (Integer 클래스와 Character 클래스만 자신 기본 타입과 이름 다름)
		
		// Boxing : 기본 타입 데이터를 래퍼 클래스 인스턴스로 변환하는 과정 (기본 타입 -> 래퍼 클래스)
		Integer i1 = new Integer(10);
		System.out.println(i1); 	// 10 (Integer)
		
		// Unboxing :  래퍼 클래스 인스턴스에 저장된 값을 다시 기본 타입 데이터로 꺼내는 과정 (래퍼 클래스 -> 기본 타입)
		int i2 = i1.intValue(); 	// 언박싱을 위한 intValue() 메소드
		System.out.println(i2); 	// 10 (int)
		
		// Auto : JDK 1.5부터 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리
		
		// parseXXX() : 문자열 기본타입 -> 본래 기본타입
		System.out.println(Integer.parseInt("10"));			// 10
		System.out.println(Boolean.parseBoolean("true"));	// true
		System.out.println(Double.parseDouble("10.3"));  	// 10.3
		
		// Math
		// random() : 0.0 <= random < 1.0 (0.0에서 1사이의 난수)
		System.out.println(Math.random());
		System.out.println((int)0.95); 	// 0
		
		// 1 ~ 10 난수 생성
		System.out.println((int)(Math.random()*10 + 1));
		
		
		
		
		
	}

}
