package enumdemo;

public enum EnumDemo2 {
	RED("ºìÉ«"), bLUE("À¶É«"), YELLOW("»ÆÉ«");

	private EnumDemo2(String name) {
		this.setname(name);
	}

	private String name;

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		for (EnumDemo2 c : EnumDemo2.values()) {
			System.out.println(c.ordinal() + "------->" + c.getname() + "-------" + c.name());
		}

	}

}
