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
			if ("红色".equals(name)) {
				this.name = name;
			} else {
				System.out.println("设置错误颜色");
			}
			break;
		}
		case BLUE: {
			if ("蓝色".equals(name)) {
				this.name = name;
			} else {
				System.out.println("设置错误颜色");
			}
			break;
		}
		case YELLOW: {
			if ("黄色".equals(name)) {
				this.name = name;
			} else {
				System.out.println("设置错误颜色");
			}
			break;
		}
		default:
			break;
		}
	}

	public static void main(String[] args) {
		
		EnumSetnameDemo c = EnumSetnameDemo.RED;
		c.setName("红色");
		c.setName("宏色");
		System.out.println(c.ordinal() + "----->" + c.getName() + "<-----" + c.name);
		EnumSetnameDemo d = EnumSetnameDemo.valueOf(EnumSetnameDemo.class, "BLUE");
		d.setName("兰色");
		d.setName("蓝色");
		System.out.println(d.ordinal() + "----->" + d.getName() + "<-----" + d.name);		
	}

	

}
