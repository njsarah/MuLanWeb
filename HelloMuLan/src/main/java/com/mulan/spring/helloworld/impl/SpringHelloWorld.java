package com.mulan.spring.helloworld.impl;

import com.mulan.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld{
	@Override
	public void sayHello()
	{
		System.out.println("Spring say hello");
	}
}
