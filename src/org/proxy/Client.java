package org.proxy;

/**
 * 测试类
 * @author yang
 *
 */
public class Client {
	public static void main(String[] args) {
//		单例模式的实现
//		Car car = Car.getCar();
//		Car car = new Car();
//		使用继承方式
//		car.move();
//		Moveable m = new Car2();//静态代理的实现
//		m.move();				//静态代理的实现
//		使用聚合方式实现
//		Car car = new Car();
//		Moveable m = new Car3(car);
//		m.move();
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}

}
