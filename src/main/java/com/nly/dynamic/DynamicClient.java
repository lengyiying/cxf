package com.nly.dynamic;

import javax.jws.WebService;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

@WebService
public class DynamicClient {
	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client =  dynamicClientFactory.createClient("echo.wsdl");
		Object res[] = client.invoke("echo", "test echo");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
