package usualusedemo;

import java.util.Timer;

public class Timerdemo2 {
	
	public static void main(String[] args) {
		Timer t = new Timer();
		TimeDemo timeDemo = new TimeDemo();
		t.schedule(timeDemo, 500,5000);
		
	}


}
