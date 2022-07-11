package sns;

import sns.entity.UserBean;

public class App {

	public static void main(String[] args) {
		UserBean user = new UserBean();

//		user.email = "test@example.com";
//		user.name = "東京　太郎";

		//setter
		user.setEmail("test@example.com");
		user.setName("東京　太郎");
		user.setPassword("pass1234");

		//getter
		String email = user.getEmail();
		System.out.println(email);

		String name = user.getName();
		System.out.println(name);

		String pasword = user.getPassword();
		System.out.println(pasword);
	}

}
