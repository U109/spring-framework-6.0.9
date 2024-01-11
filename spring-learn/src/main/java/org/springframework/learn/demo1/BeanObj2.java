package org.springframework.learn.demo1;

import org.springframework.stereotype.Component;

/**
 * @author: Zzz
 * @date: 2024/1/11 14:12
 * @description:
 */
@Component
public class BeanObj2 {

	public BeanObj2() {
		System.out.println("调用beanObj2的构造方法");
	}

	@Override
	public String toString() {
		return "BeanObj2{}";
	}
}

