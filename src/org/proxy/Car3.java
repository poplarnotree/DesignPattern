package org.proxy;

/**
 * 聚合方式实现静态代理
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
		System.out.println("汽车开始行驶...");

		car.move();

		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶时间:" + (endtime - startime) + "毫秒");
	}
	
}
