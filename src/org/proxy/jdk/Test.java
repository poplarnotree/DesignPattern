package org.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.proxy.Car;
import org.proxy.Moveable;

/**
 * JDK��̬���������
 * @author yang
 *
 */
public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader �������
		 * interfaces ʵ�ֽӿ�
		 * h invocationHandler
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), 
				cls.getInterfaces(), h);
		m.move();
	}
}
