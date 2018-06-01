package enumdemo;

public enum EnumInterFaceDemo implements Print {
	FOOTBALL, BASKETBALL, PINGPANGBALL;

	@Override
	public void playboll() {
		// TODO Auto-generated method stub
		switch (this) {
		case FOOTBALL:
			System.out.println("������");
			break;
		case BASKETBALL:
			System.out.println("������");
			break;
		case PINGPANGBALL:
			System.out.println("��ƹ����");
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		for(EnumInterFaceDemo boll : EnumInterFaceDemo.values()) {
			boll.playboll();
		}
	}
}
