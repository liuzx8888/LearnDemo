package Interface;

public class TestInterFace implements X,Y {
    
	@Override
	public String fun() {
		// TODO Auto-generated method stub
		return "ÍæÐ¦";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "³Ô·¹";
	}
	
	 public static void main(String[] args) {
		 TestInterFace testInterFace = new TestInterFace();
		 System.out.println(testInterFace.eat());
		 System.out.println(testInterFace.fun());
		 
		 
	 }

}
