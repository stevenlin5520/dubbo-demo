package com.steven.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * �����ṩ�߽ӿ�ʵ����
 * @author Administrator
 *
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        context.start();
        
        System.out.println("�����ṩ����ע�������������");
        System.in.read();	//�������ѣ�������ִֻ��һ��
        context.close();
    }

}
