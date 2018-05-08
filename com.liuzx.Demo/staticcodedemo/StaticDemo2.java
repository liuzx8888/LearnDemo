package staticcodedemo;

public class StaticDemo2 {
	
	public  static void main (String[] args) {
	
		StaticDemo1 staticDemo1 = new StaticDemo1();
		StaticDemo1 staticDemo2 = new StaticDemo1();	
		StaticDemo1 staticDemo3 = new StaticDemo1();	
		
		StaticDemo1.setCountry("ÃÀ¹ú");
		System.out.println(StaticDemo1.getCountry());
		
		 System.exit(1);
		
}
}
