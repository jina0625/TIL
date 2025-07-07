package step06;

public class Car {
	private int maxSpeed;
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		countOfCars++;
	}
	
	// 게터 메서드
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	// 세터 메서드
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// 클래스 변수
	static int countOfCars = 0;
	
	// 인스턴스 변수
	String brand;
	int year;
	String color;
	
	// 기본 생성자
	public Car() {
		System.out.println("새로운 자동차 객체가 생성되었습니다.");
		this.carInfo(); // 인스턴스 메서드 호출
		countOfCars++;
		countOfCarsInfo();
	}
	
	// 매개변수가 2개 있는 생성자
	public Car(String brand, int year) {
		System.out.println("새로운 자동차 객체가 생성되었습니다.");
		this.brand = brand;
		this.year = year;
		this.color = "white";
		this.carInfo(); // 인스턴스 메서드 호출
		countOfCars++;
		countOfCarsInfo();
	}
	
	// 매개변수가 3개 있는 생성자
	public Car(String brand, int year, String color) {
		System.out.println("새로운 자동차 객체가 생성되었습니다.");
		this.brand = brand;
		this.year = year;
		this.color = color;
		countOfCars++;
		countOfCarsInfo();
	}
	
	// 인스턴스 메서드 : 인스턴스 변수에 접근할 수 있는 메서드
	public void carInfo() {
		System.out.println("--- 자동차 정보 ---");
		System.out.println("브랜드 : " + brand);
		System.out.println("연식 : " + year);
		System.out.println("색 : " + color);
	}
	
	// 클래스 메서드 : 클래스 변수에 접근할 수 있는 메서드 (static 키워드 사용해 정적 메서드라고도 함)
	public static void countOfCarsInfo() {
		System.out.println("자동차 수량 : " + countOfCars);
	}
	}
