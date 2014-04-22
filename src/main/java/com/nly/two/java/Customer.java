package com.nly.two.java;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.nly.two.define.CustomerType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	String name;
	String number;
	String[] adress;
	Date birthday;
	CustomerType type;
}
