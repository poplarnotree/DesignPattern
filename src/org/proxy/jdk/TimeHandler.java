package org.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	
	private Object target;
	
	/**
	 * ����:
	 * proxy ����������
	 * method ����������ķ���
	 * args �����Ĳ���
	 * 
	 * ����ֵ:
	 * Object �����ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		method.invoke(target);
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ...������ʻʱ��:" + (endtime - startime) + "����");
		return null;
	}

}