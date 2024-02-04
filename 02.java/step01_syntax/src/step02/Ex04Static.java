package step02;

class Customer {
	// 인스턴스 변수
	String name;
	static String company;
	// static 초기화 블럭{ } -> 객체 생성 없이도 메서드나 변수 사용 가능(new() 할당 관계없이 호출 가능)
 	static {
		company = "it";
	}
 	
 	// name = "java";	->  에러 : static 키워드x
 	
 	// 상수 : static final 타입 CONSTANT_VALUE (대문자 사용)
 	static final double PI = 3.14;
 	
 	// 생성자
 	Customer() {}
 	
 	// 메소드
 	String getName() {
 		return name;
 	}
 	
 	static String getCompany() {
 		return company;
 	}
}


public class Ex04Static {
	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println(customer.name); 				// null
		System.out.println(Customer.getCompany()); 		// it
		
		// Customer.PI = 3.141592;	->  에러 발생 : 상수는 재할당 허용x
		System.out.println(Customer.PI); 		// 3.14
		
	}

}
