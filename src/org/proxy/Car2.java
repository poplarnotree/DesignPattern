package org.proxy;
/**
 * ��̬�����ʵ��
 * @author yang
 *
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long startime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");

		super.move();

		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ...������ʻʱ��:" + (endtime - startime) + "����");
	}

}
