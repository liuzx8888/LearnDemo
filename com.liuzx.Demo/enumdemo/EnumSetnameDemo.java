package enumdemo;

public enum EnumSetnameDemo {
	RED, BLUE, YELLOW;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		switch (this) {
		case RED: {
			if ("��ɫ".equals(name)) {
				this.name = name;
			} else {
				System.out.println("���ô�����ɫ");
			}
			break;
		}
		case BLUE: {
			if ("��ɫ".equals(name)) {
				this.name = name;
			} else {
				System.out.println("���ô�����ɫ");
			}
			break;
		}
		case YELLOW: {
			if ("��ɫ".equals(name)) {
				this.name = name;
			} else {
				System.out.println("���ô�����ɫ");
			}
			break;
		}
		default:
			break;
		}
	}

	public static void main(String[] args) {
		
		EnumSetnameDemo c = EnumSetnameDemo.RED;
		c.setName("��ɫ");
		c.setName("��ɫ");
		System.out.println(c.ordinal() + "----->" + c.getName() + "<-----" + c.name);
		EnumSetnameDemo d = EnumSetnameDemo.valueOf(EnumSetnameDemo.class, "BLUE");
		d.setName("��ɫ");
		d.setName("��ɫ");
		System.out.println(d.ordinal() + "----->" + d.getName() + "<-----" + d.name);		
	}

	

}
