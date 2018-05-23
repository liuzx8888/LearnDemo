package usualusedemo;

import java.util.Observable;
import java.util.Observer;

public class obserdemo1 implements Observer {

	public obserdemo1(String name) {
		super();
		this.name = name;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof String) {
			System.out.println(this.name +"现在的价格是：" + (String) arg);
		}
	}

	public static void main(String[] args) {
		obserdemo1 obserdemo1 = new obserdemo1("A");
		obserdemo1 obserdemo2 = new obserdemo1("B");		
		obserdemo1 obserdemo3 = new obserdemo1("C");

		obserdemo  obserdemo = new obserdemo("46000/M");
		obserdemo.addObserver(obserdemo1);
		obserdemo.addObserver(obserdemo2);
		obserdemo.addObserver(obserdemo3);		
		System.out.println(obserdemo);
		obserdemo.setPrice("48000");
		System.out.println(obserdemo);		
		
	}

}
