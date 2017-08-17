package org.factory;
/**
 * 新年系列加工厂
 * @author yang
 *
 */
public class HNFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new HNBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNGirl();
	}

}
