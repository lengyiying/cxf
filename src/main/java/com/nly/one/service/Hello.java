/*package com.nly.one.service;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.nly.one.domain.User;

@WebService(endpointInterface="com.nly.service.IHello",serviceName="IHello")
public class Hello implements IHello {

	@Override
	public String sayHi(String context) {
		System.out.println("say hello");
		return context;
	}

	@Override
	public Map<String, User> getUser() {
		Map<String,User> map = new HashMap<String,User>();
		User user = new User();
		user.setUserName("nly");
		user.setAge(26);
		map.put("user", user);
		return map;
	}


}
*/