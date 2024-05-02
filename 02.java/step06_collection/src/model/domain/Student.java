package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor	  // 모든 필드 값을 파라미터로 받는 생성자 만듦
@NoArgsConstructor	 //	파라미터 없는 기본 생성자 생성 
@Getter
@Setter
@ToString
//Comparable 인터페이스 : compareTo() 메서드 통해 객체 간 순서 비교 할 수 있도록 해줌
//-> Comparable 인터페이스 구현한 클래스는 인스턴스들에게 순서가 존재한다는 뜻
public class Student implements Comparable<Student>{
	private String name;
	private int studentNo;
	private String grade;
	
	
	@Override
	public int compareTo(Student student) {
		if(student.getStudentNo() < this.getStudentNo()) {
			return -1;
		} else if (this.getStudentNo() < student.getStudentNo()) {
			return 1;
		}
		return 0;
	}
}
