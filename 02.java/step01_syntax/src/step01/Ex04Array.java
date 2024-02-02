package step01;

import java.util.Arrays;

public class Ex04Array {

	public static void main(String[] args) {

		// 배열
		
		/* 1. 타입[] 배열이름;
		 * 2. 타입 배열이름[];
		 * 		타입 : 배열 요소로 저장되는 변수 타입 명시
		 * 		배열 이름 : 배열 선언 후 배열에 접근하기 위해 사용
		 * 
		 * 	-> 위와 같이 선언된 배열은 new 키워드 사용해 실제 배열로 생성 가능
		 *  배열이름 = new 타입[배열길이];
		 * 
		 *  -> 배열 선언과 생성 동시 가능
		 *  타입[] 배열이름 = new 타입[배열길이];
		 *  	배열길이 : 해당 배열이 몇 개 배열 요소 가지게 되는지 명시	
		 */		 
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {};
		int[] arr3 = new int[3]; 	// 초기 배열 크기 고정
		
		int[] arr4;
		arr4 = new int[] {4, 5, 6}; // 생성과 동시에 초기화 반드시 필수
		
		int[] arr5 = {1, 2, 3, 4, 5};
		
		// ArrayIndexOutOfBoundsException 예외 발생
		// arr의 범위는 arr[0] ~ arr[4]로 총 5개의 인덱스를 생성 -> arr[5]는 존재하지 않기 때문에 예외 발생!
		// System.out.println(arr5[5]); 
		
		// length : 문자열 길이 반환
		// 참조) size : 실제 사용하고 있는 크기
		for(int i =0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		System.out.println();
		
		// 다중배열
		int[][] numbers = {
							{5, 10},
							{4, 8},
							{3, 6},
							{2, 7},
							
						};
		System.out.println(numbers[2][1]);
		
		System.out.println();
		
		// 다중배열 모든 요소 출력
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println();
		
		// 복사 
		// 1. 얕은 복사 : 값 자체 복사 X, 주소값 복사(같은 메모리 가짐)
		int[] arr6 = {1, 2, 3};
		int[] arr7 = arr6;
		
		arr6[0] = 10;
		System.out.println(arr6[0]);
		System.out.println(arr7[0]);
		
		System.out.println();
		
		System.out.println(arr6);	// [I@15db9742
		System.out.println(arr7);	// [I@15db9742
		
		System.out.println();
		
		// 2. 깊은 복사 : 데이터 자체 통째로 복사 (완전히 독립적이 메모리 차지)
		// 1)
		int[] arr8 = {10, 20, 30};
		int[] arr9 = new int[arr8.length];
		
		for(int i = 0; i < arr9.length; i++) {
			arr9[i] = arr8[i];
		}
		
		
		// 실제 깊은 복사 잘 되었는지 확인하는 법
		arr8[0] = 100;
		System.out.println(arr8);	// [I@6d06d69c
		System.out.println(arr9);	// [I@7852e922
		
		for(int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]); 	// {100, 20, 30}
		}
		
		for(int i = 0; i < arr8.length; i++) {
			System.out.println(arr9[i]);	// {10, 20, 30}
		}
		
		System.out.println();
		
		// 2) etc
		// clone : 해당 인스턴스를 복제, 새로운 인스턴스를 생성해 반환
		int[] arr10 = arr8.clone();
		for(int i : arr10) {
			System.out.println(i);
		}
		
		System.out.println(arr8);	// [I@6d06d69c
		System.out.println(arr10);	// [I@4e25154f
		
		// Arrays.copyOf(원본배열명, 복사할 요소 개수) : 전달받은 배열 특정 길이만큼 새로운 배열로 복사해 반환
		int[] arr11 = Arrays.copyOf(arr8, 4);
		for(int i : arr11) {
			System.out.println(i); // {100, 20, 30, 0} -> 새로운 배열 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소 타입에 맞게 채워짐
		}
		
		System.out.println(arr8);	// [I@6d06d69c
		System.out.println(arr11);	// [I@70dea4e
		
		
		
		
		
		
	}

}
