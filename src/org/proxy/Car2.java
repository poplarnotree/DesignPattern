package org.proxy;
/**
 * 静态代理的实现
 * @author yang
 *
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long startime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");

		super.move();

		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶时间:" + (endtime - startime) + "毫秒");
	}

}
