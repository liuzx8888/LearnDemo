package staticcodedemo;

public class StaticDemo1 {
	
	String city ="����";
	static  String country ="�й�";
    static  int count =0;
	
	public StaticDemo1() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println("������"+count+"����");
	}
	
/*
 * �Ǿ�̬�������Ե��þ�̬��������̬����ֻ�ܵ��þ�̬������
 */
	public static void setCountry (String Countryname) {
		country =Countryname;		
	}
	
	public static String getCountry () {
		return country;
	}
	
	public String name(String name) {
		setCountry("Ӣ��");
		return name;
		
	}
	
}
