/* instanceOf
 * 		- 객체가 어떤 클래스인지, 어떤 클래스 상속받았는지 확인하는데 사용하는 연산자
 * 		- 참조변수가 참조하고 있는 인스턴스 실제 타입을 알아보기 위해 해당 연산자 사용
 * 		- 문법 : 객체 instanceOf 타입
 * 		- 결과 : boolean (true / false)
 */

package step02.oop;

class A {}
class B extends A {}
class C extends A {}

public class InstanceOf {
	public static void main(String[] args) {

		A b = new B();
		A c = new C();
		
		System.out.println(b instanceof A);		// true
		System.out.println(b instanceof B);		// true
		System.out.println(b instanceof C);		// false
		
		System.out.println();
		
		System.out.println(c instanceof A);		// true
		System.out.println(c instanceof B);		// false
		System.out.println(c instanceof C);		// true
		
		System.out.println();
		
		B b2 = new B();
		System.out.println(b2 instanceof A); 	// true
		System.out.println(b2 instanceof B);	// true
//		System.out.println(b2 instanceof C); 	// 에러 : Incompatible conditional operand types(부모 타입 다르기 때문)
	}

}
