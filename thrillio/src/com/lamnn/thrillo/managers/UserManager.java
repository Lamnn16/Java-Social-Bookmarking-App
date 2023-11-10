package com.lamnn.thrillo.managers;

import com.lamnn.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, String gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
}
