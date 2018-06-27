package com.duncan.alibaba.dubbo.consumber;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.duncan.alibaba.dubbo.demo.DemoService;

public class Consumer {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getPermissions(1L));
	}
	
}
