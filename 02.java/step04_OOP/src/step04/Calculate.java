/* 인터페이스
 * 		- class 대신 interface 사용
 * 		- 클래스와 같이 접근제어자로 public or default 사용 가능
 * 		- 추상 클래스와 달리 몸통 갖춘 일반 메소드 or 멤버 변수를 구성원으로 가질 수 X
 * 		- 오직 추상 메소드와 상수만 멤버로 가질 수 있음
 * 		- 모든 멤버변수 public static final이어야 함(생략 가능)
 * 		- 모든 메소드 public abstract이어야 함(생략 가능)
 * 		- 인터페이스로만 상속받을 수 있음(클래스와 달리 다중 상속 가능)
 */

package step04;

public interface Calculate {
	// 상수 : public static final 생략 가능
	double PI = 3.14;
	
	// 추상메소드
	public int add(int num1, int num2);
	
}
