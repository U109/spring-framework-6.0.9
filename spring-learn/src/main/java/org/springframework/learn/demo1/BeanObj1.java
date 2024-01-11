package org.springframework.learn.demo1;

import org.springframework.stereotype.Service;

/**
 * @author: Zzz
 * @date: 2024/1/11 12:37
 * @description:
 */
@Service
public class BeanObj1 {

	public BeanObj1() {
		System.out.println("调用beanObj1的构造方法");
	}

	@Override
	public String toString() {
		return "BeanObj1{}";
	}

}
