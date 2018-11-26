package com.mulan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mulan.spring.helloworld.HelloWorld;
import com.mulan.spring.helloworld.HelloWorldService;

public class HelloMuLan {
	public static void main(String[] args)
	{
		//读取beans文件
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("beans.xml");
		//从xml文件中读取对应的bean
		HelloWorldService service =
				(HelloWorldService) context.getBean("HelloWorldService");
		//调用该bean对应的方法
		HelloWorld hw = service.getHelloWorld();
		hw.sayHello();
	}
}
