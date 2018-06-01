package enumdemo;

public enum EnumGetnameDemo1 {
	RED("ºìÉ«"), BLUE("À¶É«"), YELLOW("»ÆÉ«");

	private EnumGetnameDemo1(String name) {
		// TODO Auto-generated constructor stub
		this.setname(name);

	}

	String name;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}

	public static void main(String[] args) {
		for (EnumGetnameDemo1 c : EnumGetnameDemo1.values()) {
			System.out.println(c.ordinal() + "--------->" + c.name + "---------" + c.name());
		}
	}

}
