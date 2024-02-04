/* 싱글톤 패턴 (Singleton Pattern)
 * 		- 특정 클래스 인스턴스 1개만 생성되는 것 보장 
 * 		- 생성자를 통해 여러 번 호출되도 인스턴스를 새로 생성하지 않고 최초 호출 시에 만들었던 인스턴스 재활용(메모리 낭비 방지)
 */

package step03;

public class Singleton {
	// private static 변수
	private static Singleton instance = new Singleton();
	
	// private 생성자
	private Singleton() {}
	
	// getInstance 메소드
	public static Singleton getInstance() {
		return instance;
	}
		}
