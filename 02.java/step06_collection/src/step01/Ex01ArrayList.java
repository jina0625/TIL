package step01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import model.domain.Student;

public class Ex01ArrayList {
	public static void main(String[] args) {
		
		// ArrayList : 배열은 크기가 고정이지만 ArrayList는 크기 가변적
		ArrayList al1 = new ArrayList();
		
		// add() : ArrayList 생성 후 add() 메소드로 엘레먼트 추가 가능
		//					-> set() 메소드로 기존에 추가된 값 변경 가능
		al1.add("java");
		al1.add(3); 	// Integer 저장
		al1.add(new Student("java", 1001, "Junior"));
		
		// Iterator : 배열이나 그와 유사한 자료구조(HashSet 등)의 내부요소 순회하는 객체
		Iterator<?> iter = al1.iterator();
		// hasNext() -> boolean 타입 반환(다음에 가져올 값 있으면 True, 없으면 False)
		while(iter.hasNext()) {
			// next() -> 매개변수 or iterator되는 타입으로 반환(아무 타입으로 반환 가능)
			System.out.println(iter.next());
		}
		System.out.println();
		
		System.out.println(al1); 		// [java, 3, Student(name=java, studentNo=1001, grage=Junior)]
		
		// get() : 해당 인덱스 값 가져오는 명령어
		System.out.println(al1.get(1)); // 3
		
		// remove() : 인덱스로 삭제 + 삭제한 결과값 반환
		System.out.println(al1.remove(0)); 	// java
		System.out.println(al1); 			// [3, Student(name=java, studentNo=1001, grage=Junior)]
		
		// 반복문
		// 반복문 활용 Junior 출력
		for(int i = 0; i < al1.size(); i++) {
			// instanceof : 해당 클래스가 타입 맞는지 확인해 주는 것
			/*		- paraent instanceof Parent : true
			 * 		- child instanceof Parent : true
			 * 		- parent instanceof Child : false
			 * 		- child instanceof Child : true
			 */
			if(al1.get(i) instanceof Student) {
				System.out.println(((Student)al1.get(i)).getGrade()); 	// Junior
			}
		}
			
		// 제네릭 Generic <T> : 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들 가질 수 있도록 하는 방법
		// 객체 <타입> 객체명 = new 객체 <타입>();
		ArrayList<Student> al2 = new ArrayList<Student>();

		System.out.println();
		
		ArrayList<String> aList = new ArrayList<String>();
		LinkedList<String> lList = new LinkedList<String>();
		
		long start;
		long end;
		
		for(int i =0; i < 30000; i++) {
			// valueOf() : ()괄호 안 해당 객체를 String 객체로 변환
			lList.add(0, String.valueOf(i));
		}
		
		// nanoTime() : 경과된 시간 측정하는데 사용
		start = System.nanoTime();
		for(int i = 0; i < 30000; i++) {
			lList.get(i);
		}
		end = System.nanoTime();
		
		System.out.println(end - start);
		// ArrayList get()  : 1508700
		// LinkedList get() : 292065500
		

	}

}
