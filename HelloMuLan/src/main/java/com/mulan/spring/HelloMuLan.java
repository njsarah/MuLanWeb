package com.mulan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mulan.spring.helloworld.HelloWorld;
import com.mulan.spring.helloworld.HelloWorldService;

public class HelloMuLan {
	public static void main(String[] args)
	{
		//��ȡbeans�ļ�
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("beans.xml");
		//��xml�ļ��ж�ȡ��Ӧ��bean
		HelloWorldService service =
				(HelloWorldService) context.getBean("HelloWorldService");
		//���ø�bean��Ӧ�ķ���
		HelloWorld hw = service.getHelloWorld();
		hw.sayHello();
	}
}
