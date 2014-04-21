package com.nly.one.service;

import org.apache.cxf.aegis.databinding.AegisDatabinding;
import org.apache.cxf.frontend.ServerFactoryBean;


public final class Server {
	private Server() {}
	
	public static void startServer() {
		IHello hello = new Hello();
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setServiceClass(Hello.class);
		bean.setAddress("http://localhost:8080/cxfDemo");
		bean.setServiceBean(hello);
		bean.getServiceFactory().setDataBinding(new AegisDatabinding());
		
		bean.create();
	}
	
	public static void main(String[] args) throws InterruptedException {
		startServer();
		
		System.out.println("server is reading...");
		
		Thread.sleep(100000);
		
		System.out.println("server is stopping");
		
		System.exit(0);
	}
}
