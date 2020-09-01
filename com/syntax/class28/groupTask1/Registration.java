package com.syntax.class28.groupTask1;

public class Registration {
	private String email, userName, password;

	public void setEmail(String email) {

		if (email.split("@")[1].split("\\.")[0].equalsIgnoreCase("yahoo"))
			this.email = email;
	}

	public void setUserName(String userName) {
		if (userName.length() > 6)
			this.userName = userName;
	}

	public void setPassword(String password) {
		if (password.length() > 6 && !password.contains(userName))
			this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
