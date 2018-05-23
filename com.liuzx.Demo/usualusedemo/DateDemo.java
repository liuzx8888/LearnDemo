package usualusedemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
	
		Calendar calendar = Calendar.getInstance();
		Calendar calendar1 = new GregorianCalendar();/*通过子类实例化*/
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.MONTH));
		System.out.println(calendar.get(calendar.DATE));
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(calendar.MINUTE));
		System.out.println(calendar.get(calendar.SECOND));
		
		String pattern1="yyyy-MM-dd HH:mm:ss:sss";
		String pattern2="yyyy年MM月dd日HH时mm分ss秒sss毫秒";	
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		System.out.println(simpleDateFormat1.format(date));
		System.out.println(simpleDateFormat2.format(date));		
	}

}
