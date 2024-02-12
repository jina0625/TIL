package step01;

class Info {
	
}


public class Ex02Exception {
	public static void main(String[] args) {

		// try : 실제 코드가 들어가는 곳 (예외 발생할 가능성 있는 코드)
		try {
			// Class.forName() : 컴파일 타임에 직접적인 참조 없이 런타임에 동적으로 클래스 로드(코드 실행하는 순간 클래스 로딩)
			Class.forName("step01.Info");
			
			String str = null;
			System.out.println(str.length()); 	// NPE 처리 코드
			
		// catch : Try 블록에서 Exception 발생시 코드 실행 순서가 catch쪽으로 옴 (예외에 대한 처리 코드)
		} catch (ClassNotFoundException | NumberFormatException e) {
		//  e.printStackTrace();
			System.out.println("ClassNotFoundException or NumberFormatException 처리 코드");
		} catch (NullPointerException e) {
		//	e.printStackTrace();
			System.out.println("NPE 처리 코드");
		} catch (Exception e) {
		//	e.printStackTrace();
			System.out.println("모든 예외 처리 코드");
		
		// finally : try블록에서 Exception 발생 유무 상관 없이 무조건 수행되는 코드(생략 가능)
		} finally {
			System.out.println("finally");
		}
	}

}
