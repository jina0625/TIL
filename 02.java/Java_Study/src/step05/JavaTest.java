package step05;

public class JavaTest {

	public static void main(String[] args) {
		// 이차원 배열로 구구단 프로그램 만들기
		int[][] gugudan = new int[9][9];
		for(int i = 1; i < gugudan.length; i++) {
			System.out.println("---" + i + "단 ---" );
			for(int j = 1; j < gugudan.length; j++) {
				gugudan[i][j] = i * j;
				System.out.println(i + "X" + j + "=" + gugudan[i][j] );
			}
		}
		
		// 이차원 배열 사용한 학생들의 성적 저장 출력 프로그램
		int[][] scoreArray = {{85, 70, 90, 95}, {80, 95, 90, 75}, {75, 85, 90, 80}};
		System.out.println("학생들의 성적은 다음과 같습니다.");
		for(int i = 0; i < scoreArray.length; i++) {
			int sum = 0;
			System.out.println(("학생" + (i + 1) + ": " ));
			for(int j = 0; j < 4; j++) {
				System.out.println(scoreArray[i][j] + "");
				sum += scoreArray[i][j];
			}
			//System.out.println(sum);
			double average = (double) sum / scoreArray[i].length;
			//System.out.println(average);
			System.out.println("평균:" + average);
			System.out.println("");
		}
		System.out.println();
		
		
	}

}
