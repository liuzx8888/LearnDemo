package Interface;

public class TestInterFace implements X,Y {
	/* ȫ�ֳ���
	 * ���󷽷� ���
	 * ʵ�ֽӿڵ����࣬������д�ӿ������з���
	 */
	@Override
	public String fun() {
		// TODO Auto-generated method stub
		return "��Ц";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "�Է�";
	}
	
	 public static void main(String[] args) {
		 TestInterFace testInterFace = new TestInterFace();
		 System.out.println(testInterFace.eat());
		 System.out.println(testInterFace.fun());
		 
		 
	 }

}
