package org.proxy;

public class CarTimeProxy implements Moveable {
	
	public CarTimeProxy(Moveable m) {
		super();
		this.m=m;
	}
	
	private Moveable m;
	
	@Override
	public void move() {
		long startime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶时间:" + (endtime - startime) + "毫秒");
	}

}
