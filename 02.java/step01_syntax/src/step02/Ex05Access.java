package step02;

/* 접근 제한자 (Access modifier)
 *  	modifier[제어자]
 *  1. access modifier
 *  		- 적용되는 위치
 *  			1) 클래스 선언구 : public, default
 *  			2) 변수 선언구 : public, protected, default, private
 *  			3) 생성자 선언구 : public, protected, default, private
 *  			4) 메소드 선언구 : public, protected, default, private
 *  
 *  		- 호출 가능한 범위 제한
 *  			1) public : 동일한 클래스, 동일한 package, 외부 package에서 호출 가능
 *  			2) protected : 동일한 클래스, 동일한 package
 *  							상속관계 외부 package 클래스에선 호출 가능
 *  			3) default[friendly] : 동일한 package에서만 접근 가능
 *  			4) private : 동일한 class내에서만 접근 가능
 *  
 *  2. 기타 modifier
 *  		- 옵션
 *  			1. static
 *  					1) 변수  - 공유 자원
 *  					2) 메소드 - 객체 생성없이 메소드 호출 가능 기능만 제공
 *  					3) static{} - 공유자원 단 1번 실행, byte code 로딩 시 단 한번 실행
 *  			2. abstract : 추상
 *  			3. final
 *  			4. synchronized
 */

import model.domain.People;

public class Ex05Access {
	public static void main(String[] args) {
		People java = new People("java", 28);
		
		// java.name = "Java"; -> 접근 불가능(캡슐화 했기 때문)
		java.setName("Ace");
		// System.out.println(java.name); -> 접근 불가능(캡슐화 했기 때문)
	}

}
