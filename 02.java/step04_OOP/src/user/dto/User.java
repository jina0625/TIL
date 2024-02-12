package user.dto;

public class User {
	private String id;
	private String email;
	private String password;
	private String name;
	private Integer age;

	public User() {
	}

	public User(String id, String email, String password, String name, Integer age) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	/*
	 * 빌더 패턴(Builder Pattern) - 복잡한 객체들을 단계별로 생성할 수 있도록 하는 생성 디자인 패턴 - 장점 : 필요한 데어터만
	 * 설정 가능 유연성 확보 가능 가독성 높일 수 있음 변경 가능성 최소화 가능
	 */

	// 빌더 패턴을 위한 내부 Builder 클래스 => User 객체 생성
	static public class Builder {
		private String id;
		private String email;
		private String password;
		private String name;
		private Integer age;

		// 기본 생성자
		public Builder() {
		}

		// 사용자 정의 생성자
		public Builder(User user) {
			this.id = user.id;
			this.email = user.email;
			this.password = user.password;
			this.name = user.name;
			this.age = user.age;
		}

		//
		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(Integer age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(id, email, password, name, age);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Builder [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", age=" + age
				+ "]";
	}

}
