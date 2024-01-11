package org.springframework.learn.demo1;

import org.springframework.stereotype.Component;

/**
 * @author: Zzz
 * @date: 2024/1/11 14:12
 * @description:
 */
@Component
public class TestBean2 {

	public TestBean2() {
		System.out.println("调用TestBean2的构造方法");
	}

	@Override
	public String toString() {
		return "TestBean2";
	}
}

