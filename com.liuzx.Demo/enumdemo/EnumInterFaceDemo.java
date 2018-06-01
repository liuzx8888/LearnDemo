package enumdemo;

public enum EnumInterFaceDemo implements Print {
	FOOTBALL, BASKETBALL, PINGPANGBALL;

	@Override
	public void playboll() {
		// TODO Auto-generated method stub
		switch (this) {
		case FOOTBALL:
			System.out.println("Íæ×ãÇò");
			break;
		case BASKETBALL:
			System.out.println("ÍæÀºÇò");
			break;
		case PINGPANGBALL:
			System.out.println("ÍæÆ¹ÅÒÇò");
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
