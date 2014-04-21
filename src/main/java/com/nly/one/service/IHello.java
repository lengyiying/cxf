package com.nly.one.service;

import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.nly.one.domain.User;


@WebService
public interface IHello {
	String sayHi(@WebParam(name="sayContext")String context);
	
	Map<String,User> getUser();
	
	
}
