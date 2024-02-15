package step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex04Map {
	public static void main(String[] args) {

		/*HashMap
		 * 	- 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이뤄 저장됨
		 * 	- 데이터 추가, 삭제, 검색 빠름
		 * 	- 키값 통해서만 검색 가능, 키 값은 중복될 수 없고, 벨류 값은 키 값 다르면 중복 가능
		 */
		
		// Map : hashMap이 구현하는 인터페이스
		Map<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
	
		// put() : key와 value 저장
		hm1.put("a", 1);
		hm1.put("b", 2);
		hm1.put("c", 3);
		hm1.put("d", 4);
		hm1.put("e", 5);
		
		System.out.println(hm1); 	// {a=1, b=2, c=3, d=4, e=5}
		
		// get() : key와 맵핑된 value값 반환
		System.out.println(hm1.get("c"));	// 3
		
		// remove() : key와 일치하는 기존 데이터(key, value) 삭제
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("a");
		al2.add("b");
		al2.add("c");
		
		HashMap<String, ArrayList> hm2 = new HashMap<String, ArrayList>();
		hm2.put("al2", al2);
		
		System.out.println(hm2); 	// {al2=[a, b, c]}
		
		// b 출력
		System.out.println(hm2.get("al2").get(1));
		
		HashMap<String, HashMap<String, ArrayList>> hm3 = new HashMap<String, HashMap<String, ArrayList>>();
		hm3.put("hm2", hm2);
		
		System.out.println(hm3); 	// {hm2={al2=[a, b, c]}}

		// b 출력
		System.out.println(hm3.get("hm2").get("al2").get(1)); // b
	}

}
