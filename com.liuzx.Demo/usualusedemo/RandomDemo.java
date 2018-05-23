package usualusedemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class RandomDemo implements Cloneable {
	
	/*
	 *  需要复写 克隆的方法
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		RandomDemo randomDemo = new RandomDemo();
		Random random = new Random();
		RandomDemo randomDemo1 = (RandomDemo) randomDemo.clone(); 
		for(int i=0;i<10;i++) {
			System.out.println((random.nextInt(100)));
		}
		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println(numberFormat.format(10000567));
		
			
		
		
	}

}
