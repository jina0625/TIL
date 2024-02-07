/* 추상 클래스
 * 		- 클래스가 전체적인 구성 다 가지지 못한 채 설계만 되어있는 클래스
 * 		- 인스턴스 생성 불가
 * 		- 상속을 통해 자식 클래스에 의해 완성됨
 * 		- 추상 메소드 하나 이상 포함 시 반드시 추상 클래스로 선언되어야함
 * 		- 추상 메소드 아닌 일반 메소드 포함 가능
 * 		- 몸체 없고 선언부만 존재
 */

package step03;

// 추상 클래스는 class 선언부 앞에 abstract 적어줘야함
public abstract class Computer {
	
	public abstract void display();	// 추상 메소드
}
