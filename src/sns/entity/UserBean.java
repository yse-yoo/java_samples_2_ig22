package sns.entity;

import java.io.Serializable;

public class UserBean implements Serializable {

	private String email;
	private String name;
	private String password;
	
	//コンストラクタ（引数なし）
	public UserBean() {
		super();
	}
	
	//getter / setter (自動で作成）
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
