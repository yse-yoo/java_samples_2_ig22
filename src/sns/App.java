package sns;

import sns.entity.UserBean;

public class App {

	public static void main(String[] args) {
		UserBean user = new UserBean();
//		user.email = "test@example.com";

		//setter
		user.setEmail("test@example.com");

		//getter
		String email = user.getEmail();
		System.out.println(email);
	}

}
