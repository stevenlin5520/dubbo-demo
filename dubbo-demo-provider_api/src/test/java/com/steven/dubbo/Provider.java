package com.steven.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者接口实现类
 * @author Administrator
 *
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        context.start();
        
        System.out.println("服务提供者向注册中心申请服务");
        System.in.read();	//持续消费，不加则只执行一次
        context.close();
    }

}
