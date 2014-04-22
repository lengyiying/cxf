package com.nly.two.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.nly.two.exception.NoCustomerException;
import com.nly.two.java.Customer;

@WebService
public interface ICustomerService {
	Customer[] getCustomerByName(@WebParam(name="userName")String name) throws NoCustomerException;
}
