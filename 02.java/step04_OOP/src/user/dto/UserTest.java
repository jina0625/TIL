package user.dto;

public class UserTest {
	public static void main(String[] args) {

		User user1 = new User("1", "1@gmail.com", "111", "1", 30);
		// (String, String, String, String, Integer) 타입 지켜줘야함)
		// User user2 = new User("2", "2", "2", 30);
		
		// 빌더 클래스는 순서 바꿔도 사용 가능
		User user3 = new User.Builder()
							.id("3")
							.email("3@gmail.com")
							.password("3")
							.name("3")
							.age(3)
							.build();
		
		System.out.println(user1); 	// Builder [id=1, email=1@gmail.com, password=111, name=1, age=30]
		System.out.println(user3); 	// Builder [id=3, email=3@gmail.com, password=3, name=3, age=3]

	}

}
