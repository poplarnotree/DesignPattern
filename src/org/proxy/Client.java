package org.proxy;

/**
 * ������
 * @author yang
 *
 */
public class Client {
	public static void main(String[] args) {
//		����ģʽ��ʵ��
//		Car car = Car.getCar();
//		Car car = new Car();
//		ʹ�ü̳з�ʽ
//		car.move();
//		Moveable m = new Car2();//��̬�����ʵ��
//		m.move();				//��̬�����ʵ��
//		ʹ�þۺϷ�ʽʵ��
//		Car car = new Car();
//		Moveable m = new Car3(car);
//		m.move();
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}

}
