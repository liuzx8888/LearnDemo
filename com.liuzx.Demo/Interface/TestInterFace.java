package Interface;

public class TestInterFace implements X,Y {
	/* 全局常量
	 * 抽象方法 组成
	 * 实现接口的子类，必须重写接口中所有方法
	 */
	@Override
	public String fun() {
		// TODO Auto-generated method stub
		return "玩笑";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "吃饭";
	}
	
	 public static void main(String[] args) {
		 TestInterFace testInterFace = new TestInterFace();
		 System.out.println(testInterFace.eat());
		 System.out.println(testInterFace.fun());
		 
		 
	 }

}
