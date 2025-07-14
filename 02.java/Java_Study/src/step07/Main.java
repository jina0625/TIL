package step07;

public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog("바둑이", 3, "진돗개");
		Cat myCat = new Cat("나비", 2);
		
		myDog.breed = "진돗개";
		myDog.name = "바둑이";
		myDog.age = 3;
		System.out.println(myDog.name + "는 " + myDog.breed + "이고, " + myDog.age + "살입니다." );
		
		myCat.name = "나비";
		myCat.age = 2;
		System.out.println(myCat.name + "는 " + myCat.age + "살입니다.");
		
		myDog.eat();
		myDog.roll(2);
		myCat.eat();
		myCat.rub();
	}

}
