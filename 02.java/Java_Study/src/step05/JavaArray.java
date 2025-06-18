package step05;

public class JavaArray {

	public static void main(String[] args) {
		// 선언 및 초기화		
		int[] scoreArray = {80, 90, 100, 70}; 
		
		System.out.println("1번 학생의 점수 : " + scoreArray[0]);
		System.out.println("2번 학생의 점수 : " + scoreArray[1]);
		System.out.println("3번 학생의 점수 : " + scoreArray[2]);
		System.out.println("4번 학생의 점수 : " + scoreArray[3]);
		
		System.out.println();
		
		scoreArray[0] = 50;
		scoreArray[1] = 60;
		scoreArray[2] = 70;
		scoreArray[3] = 80;
		
		System.out.println("1번 학생의 점수 : " + scoreArray[0]);
		System.out.println("2번 학생의 점수 : " + scoreArray[1]);
		System.out.println("3번 학생의 점수 : " + scoreArray[2]);
		System.out.println("4번 학생의 점수 : " + scoreArray[3]);
		
		System.out.println();
		
		// 반복문으로 실행
		for(int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "번 학생의 점수 : " + scoreArray[i] );
		}
		
		System.out.println();
		
		// 배열명.length
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[4] = 40;
		System.out.println("배열 크기:" + intArr.length);
		
		System.out.println();
		
		for(int i = 0; i < scoreArray.length; i++) {
			System.out.println(i + 1 + "번 학생의 점수 : " + scoreArray[i] );
		}
		
		System.out.println();
		
		int[] numbers = new int[4];
		int value = 10;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = value * (i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		System.out.println();
		
		// 2차원 배열
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println("");
		}
		
		System.out.println();
		
		//length 사용
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println((""));
		}
		 
	}

}
