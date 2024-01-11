package org.springframework.learn.demo1;

import org.springframework.stereotype.Service;

/**
 * @author: Zzz
 * @date: 2024/1/11 12:37
 * @description:
 */
@Service
public class TestBean1 {

	public TestBean1() {
		System.out.println("调用TestBean1的构造方法");
	}

	@Override
	public String toString() {
		return "TestBean1";
	}

}
