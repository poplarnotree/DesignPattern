package org.proxy;

import java.util.Random;

public class Car implements Moveable {

	//	����ģʽ��ʵ��
	//	private Car() {
	//	}
	//	
	//	private static Car car = new Car();
	//	
	//	public static Car getCar(){
	//        return car;
	//    }


	@Override
	public void move() {
		//		long startime = System.currentTimeMillis();
		//		System.out.println("������ʼ��ʻ...");

		//		ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//		long endtime = System.currentTimeMillis();
		//		System.out.println("����������ʻ...������ʻʱ��:" + (endtime - startime) + "����");
	}

}
