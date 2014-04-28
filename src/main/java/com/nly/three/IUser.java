package com.nly.three;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
		name="IUserService",
		wsdlLocation="http://hello/user.wsdl"
		)
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public interface IUser {
	@WebMethod(operationName="sayHiToUser")
	@RequestWrapper(className="java.lang.String")
	void sayHi(@WebParam(name="saytext",mode=Mode.IN)String text);
	@WebResult(name="getUser")
	@RequestWrapper(className="java.lang.String")
	@ResponseWrapper(className="")
	Customer getUser(String code);
}
