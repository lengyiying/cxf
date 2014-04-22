/*package com.nly.one.client;

import java.util.Map;

import org.apache.cxf.aegis.databinding.AegisDatabinding;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;

import com.nly.one.domain.User;
import com.nly.one.service.IHello;

public final class Client {

	public static void main(String[] args) {
		JaxWsClientFactoryBean bean = new JaxWsClientFactoryBean();
		if (args != null && args.length > 0 && !"".equals(args[0])) {
			bean.setAddress(args[0]);
		} else {
			bean.setAddress("http://localhost:8080/cxfDemo");
		}

		bean.getServiceFactory().setDataBinding(new AegisDatabinding());
		IHello client = (IHello) bean.create();
		Document doc = client.getDocument();
		Element e = (Element) doc.getFirstChild();
		System.out.println(e.getTagName());
		Text t = (Text) e.getFirstChild();
		System.out.println(t);
		client.sayHi("My first cxf demo...");
		Map<String,User> map = client.getUser();
		System.out.println(map.get("user").getUserName()+","+map.get("user").getAge());
	}
}
*/