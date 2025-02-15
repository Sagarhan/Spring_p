package com.rays.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestMultiple {
public static void main(String[] args) {
	
	BeanFactory  factory =new XmlBeanFactory(new ClassPathResource("Multiple.xml"));
	
	UserBean bean=(UserBean) factory.getBean("User");
	System.out.println(bean.getLogin());
	System.out.println(bean.getPassword());
	
	Person person=(Person) factory.getBean("Person");
	
	System.out.println(person.getName());
	
}

}
