package designmode;
public class ProxyInternet implements Internet {
	Internet internet  ;
	static Boolean checkResult = null;
	String name;
	String password;
	
	@Override
	public void login(String name, String password) {
		this.name =name;
		this.password =password;
		
	}
	public ProxyInternet(Internet internet) {
		// TODO Auto-generated constructor stub
		this.internet = internet;
	}
	
	public Boolean check() {
		if ("liuzx".equals(name) && "112233".equals(password)) {
			checkResult = true;
		}
		else{
			checkResult = false;			
		}
		return checkResult;
	}

	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		if(this.check()) {
			internet.browse();
		}
		else {
			System.out.println("用户名密码不正确，请重新输入");
		}
		
	}



	

}
