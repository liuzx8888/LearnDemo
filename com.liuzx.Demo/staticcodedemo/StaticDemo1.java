package staticcodedemo;

public class StaticDemo1 {
	
	String city ="北京";
	static  String country ="中国";
    static  int count =0;
	
	public StaticDemo1() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println("产生了"+count+"对象");
	}
	
/*
 * 非静态方法可以调用静态方法，静态方法只能调用静态方法。
 */
	public static void setCountry (String Countryname) {
		country =Countryname;		
	}
	
	public static String getCountry () {
		return country;
	}
	
	public String name(String name) {
		setCountry("英国");
		return name;
		
	}
	
}
