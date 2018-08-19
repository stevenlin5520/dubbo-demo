package com.steven.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

		try {
			Thread.sleep(1000);
			String hello = demoService.sayHello("world"); // call remote method
			System.out.println("远程调用的结果：" + hello); // get result
			
			System.in.read();	//持续消费，不加则只执行一次

		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
        context.close();
    }
}
