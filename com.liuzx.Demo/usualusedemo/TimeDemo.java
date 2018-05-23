package usualusedemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class TimeDemo extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String pattern ="yyyy-mm-dd HH:mm:ss:sss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		System.out.println("当前时间："+ dateFormat.format(new Date()));
		
	}
	
	
	
	
}
