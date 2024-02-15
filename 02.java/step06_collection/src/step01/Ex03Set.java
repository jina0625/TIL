package step01;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03Set {
	public static void main(String[] args) {
		/* HashSet 
		 * 	- 중복되지 않는 데이터를 순서에 상관없이 저장 (중복 허용 X)
		 */
		HashSet<String> hashSet = new HashSet<String>();
		
		// add() : 전달된 아이템 저장, hashSet에 존재하지 않는 아이템이면 true, 존재하는 아이템이면 false 리턴
		hashSet.add("Java");
		hashSet.add("IT");
		hashSet.add("Study");
		hashSet.add("Happy");
		hashSet.add("Lazy");
		hashSet.add("Lazy");
		
		System.out.println(hashSet);	// [Lazy, Java, Study, Happy, IT]
		
		// 조회
		for(String word : hashSet) {
			System.out.println(word); 	// Lazy // Java // Study // Happy // IT
		}
		
		System.out.println();
		
		// Iterator
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext()) {
			String v = iter.next();
			System.out.println(v); 	  // Lazy // Java // Study // Happy // IT
		}
		
		System.out.println();
		
		// isEmpty() : 저장된 값 없으면 true 리턴
		System.out.println(hashSet.isEmpty()); 			// false
		
		// contains() : 안에 객체 존재하는지 여부 리턴
		System.out.println(hashSet.contains("IT"));		// true
	}

}
