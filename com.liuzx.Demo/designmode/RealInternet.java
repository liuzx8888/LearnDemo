package designmode;

public class RealInternet implements Internet {
	String name; String password;
	
	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		this.name=name;
		this.password =password;
	}
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("�����������������");
	}

	public String getLoginName() {
		return this.name;
	}
	public String getPassWord() {
		return this.password;
	}

}
