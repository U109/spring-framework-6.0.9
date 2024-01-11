package org.springframework.learn.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Zzz
 * @date: 2024/1/11 14:12
 * @description:
 */
public class Demo01Main {

	public static void main(String[] args) {
		// 指定扫描的包
		ApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.learn.demo1");

		Object obj1 = context.getBean("testBean1");
		Object obj2 = context.getBean("testBean2");
		System.out.println("Bean1 : " +  obj1);
		System.out.println("Bean2 : " + obj2);
	}
}
