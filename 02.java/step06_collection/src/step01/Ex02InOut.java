package step01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex02InOut {
	public static void main(String[] args) {
		/*Stack 
		 * 	- 후입선출 (LIFO : Last-In First-Out) 
		 * 	- 가장 최근에 들어온 데이터가 가장 먼저 나감
		 * 	- 출력 순서가 입력 순서 역순으로 이뤄질 때 사용
		 */
		Stack<String> card = new Stack<String>();
		
		// push() : 스택에 데이터 삽입
		card.push("롯데");
		card.push("삼성");
		card.push("현대");
		
		System.out.println(card); 		// [롯데, 삼성, 현대]
		
		// pop() : 스택에서 데이터 삭제해 반환
		System.out.println(card.pop()); // 현대
		System.out.println(card);		// [롯데, 삼성]
		
		// isEmpty() : 스택 비어있으면 'true', 비어있지 않으면 'false' 값 반환 
		System.out.println(card.isEmpty()); 	// false
		
		// capacity() : 데이터 담기 위한 용적
		System.out.println(card.capacity()); 	// 10
		
		System.out.println();
		
		
		/* Queue
		 * 	- 선입선출 (FIFO : First in First Out)
		 * 	- 먼저 들어온 데이터가 먼저 나감(제일 처음 들어온 데이터가 먼저 삭제)
		 */
		Queue<String> drinkBox = new LinkedList<String>();
		
		// 큐 값 추가
		// offer() : 큐가 꽉 찬 경우 false 반환
		// add() : 큐가 꽉 찬 경우 illegalStateException(사용자가 값 제대로 입력했지만, 개발자 코드가 값 처리할 준비 안된 경우 발생) 에러 발생
		drinkBox.add("Coke");
		drinkBox.add("Dr.Pepper");
		drinkBox.add("Sprite");
		
		System.out.println(drinkBox); 			// [Coke, Dr.Pepper, Sprite]
		
		// poll() : 큐 값 제거 (큐 비어 있는 경우 null 반환)
		System.out.println(drinkBox.poll());	// Coke
		System.out.println(drinkBox);			// [Dr.Pepper, Sprite]
	
	
		/* 스택 vs 큐 vs 리스트
		 * 		공통점 : 선형 자료 구조, 순서 있음
		 * 		리스트 : 읽기, 삽입, 삭제를 리스트 어느 곳에서나 행함
		 * 		스택 : 삽입과 삭제를 리스트 한쪽(top)에서 행함
		 * 		큐 : 삽입은 리스트 한쪽(rear)에서 하고, 삭제는 삽입 반대쪽(front)에서 행함
		 */
	
	}

}
