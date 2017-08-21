package org.proxy;

import java.util.Random;

public class Car implements Moveable {

	//	单例模式的实现
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
		//		System.out.println("汽车开始行驶...");

		//		实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//		long endtime = System.currentTimeMillis();
		//		System.out.println("汽车结束行驶...汽车行驶时间:" + (endtime - startime) + "毫秒");
	}

}
