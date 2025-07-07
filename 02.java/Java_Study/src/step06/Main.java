package step06;

public class Main {

	public static void main(String[] args) {
		Car newCar = new Car(250);
		System.out.println("newCar의 최대 속도 : " + newCar.getMaxSpeed());
		newCar.setMaxSpeed(300);
		System.out.println("변경 후 newCar의 최대 속도 : " + newCar.getMaxSpeed());
		
		System.out.println();
		
		Car car = new Car();
		
		System.out.println();
		
		Car myCar = new Car("Hyundai", 2025);
		
		System.out.println();
		
		Car yourCar = new Car("Kia", 2025, "Black");
		yourCar.carInfo();
		
		System.out.println();
		
		Car otherCar = new Car("Genesis", 2025, "Red");
		otherCar.carInfo();
		
		System.out.println("");
		
		Car.countOfCarsInfo();
	}

}
