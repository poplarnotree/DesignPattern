package org.proxy;

/**
 * �ۺϷ�ʽʵ�־�̬����
 * @author yang
 *
 */
public class Car3 implements Moveable {
	public Car3(Car car) {
		super();
		this.car = car;
	}
	
	private Car car;

	@Override
	public void move() {
		long startime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");

		car.move();

		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ...������ʻʱ��:" + (endtime - startime) + "����");
	}
	
}
