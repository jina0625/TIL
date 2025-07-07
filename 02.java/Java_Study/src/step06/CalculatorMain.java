package step06;

public class CalculatorMain {
	public static void main(String[] args) {
		int result1 = Calculator.add(5, 10);
		int result2 = Calculator.add(3, 7);
		System.out.println("호출 횟수 : " + Calculator.count);
		System.out.println("result1" + result1);
		System.out.println("result2" + result2);
		Calculator calculator = new Calculator();
		calculator.printCount();
	}

}
