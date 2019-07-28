package com.zk.myspring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[]args)
	{
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Bean.xml"));
		Helloworld obj=(Helloworld) factory.getBean("helloworld");
		obj.getMessage();
	}
}
