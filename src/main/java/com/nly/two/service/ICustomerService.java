package com.nly.two.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.DataBinding;
import org.apache.cxf.annotations.WSDLDocumentation;
import org.apache.cxf.annotations.WSDLDocumentation.Placement;
import org.apache.cxf.annotations.WSDLDocumentationCollection;

import com.nly.two.exception.NoCustomerException;
import com.nly.two.java.Customer;

@WebService
@DataBinding(org.apache.cxf.aegis.databinding.AegisDatabinding.class)
@WSDLDocumentationCollection({
	@WSDLDocumentation("My portType documentation"),
	@WSDLDocumentation(value="My top level documentation",placement=Placement.TOP),
	@WSDLDocumentation(value="My binding doc",placement=Placement.BINDING)
})
public interface ICustomerService {
	Customer[] getCustomerByName(@WebParam(name="userName")String name) throws NoCustomerException;
}
