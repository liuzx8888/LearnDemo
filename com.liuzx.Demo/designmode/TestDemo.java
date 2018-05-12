package designmode;

public class TestDemo {

	 public static void main (String[] args) {
		 Person person1 = new FarmWorker("张三", 40); //多态
		 Person person2 = new Student("李四", 18);
		 person1.say();
		 person2.say();		
		 
		 
		 Car car = new FactoryMode().getInstance("Car2");
		 car.Color();
		 car.Price();
		 car.Type();

		 
		 String username;String password;		 
		 RealInternet realInternet = new RealInternet();
		 realInternet.login("liuzx", "445566");
		 username =realInternet.getLoginName();
		 password =realInternet.getPassWord();
		 Internet ProxyInternet = new ProxyInternet(realInternet);
		 ProxyInternet.login(username, password);
		 ProxyInternet.browse();
	 }
			
	

}
