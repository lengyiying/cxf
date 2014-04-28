package com.nly.three;

import javax.jws.WebService;

@WebService(
			name="UserService",
			endpointInterface="com.nly.three.IUser",
			serviceName="User"
		)
public class User implements IUser {
	public void sayHi(String text) {
		System.out.println("hi: " + text);
	}

}
