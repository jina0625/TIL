package step01;

public class Ex02Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산
		// 1. 산술 연산
		int v1 = 10;
		int v2 = 3;
		
		System.out.println(v1 % v2);
		
		// 증감 : ++, --
		System.out.println(v1++);
		
		// 기본 타입 연산
		// 형변환 Casting
		byte v3 = 10;
		byte v4 = 3;
		
		byte v5 = (byte)(v3 + v4);
		
		// v3, v4 활용 -> 3.333333... 출력
		System.out.println(v3 / v4);
		System.out.println((float)v3 / v4);
		
		// double -> float 형변환 가능!
		// 데이터 손실 주의!!!
		
		// 쉬프트 연산자(비트 연산자) <<, >>, >>>, |, &
		System.out.println(2 << 3);
		
		// 2. 논리연산 ||, &&, !
		System.out.println(!true);
		
		// 3. 비교연산
		// 기본타입에서는 값만 비교한다!
		
		// 4. 대입연산 =, ...
		int assign = 0;
		assign += 10;
		// assign = assign + 10;
		System.out.println(assign);
		
		// 참고 : 삼항연산 (조건)?식1:식2
		//				조건식 결과값 true : 식1 반환 / false : 식2 반환
		int i = -5;
		int res = (i >= 0)?i : -i;
		System.out.println(res);
		
		
	}

}
