package org.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
//		HairInterface left = new LeftHair();
//		left.draw();
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
//		HairInterface left = factory.getHairByClass("org.factory.LeftHair");
//		left.draw();
		
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
		
//		PersonFactory factory = new MCFactory();
//		Girl girl = factory.getGirl();
//		girl.drawWomen();
		
		PersonFactory factory = new HNFactory();
		Boy boy = factory.getBoy();
		boy.drawMan();
	}

}
