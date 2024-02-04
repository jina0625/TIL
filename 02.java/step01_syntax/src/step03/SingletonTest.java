package step03;

public class SingletonTest {
	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1); 	// step03.Singleton@15db9742
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2); 	// step03.Singleton@15db9742
	}

}
