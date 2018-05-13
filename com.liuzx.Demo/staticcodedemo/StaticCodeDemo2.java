package staticcodedemo;

public class StaticCodeDemo2 {
	public static void main(String[] args) {

		StaticCodeDemo1 staticCodeDemo1 = StaticCodeDemo1.getinstance();
		StaticCodeDemo1 staticCodeDemo2 = StaticCodeDemo1.getinstance();
		StaticCodeDemo1 staticCodeDemo3 = StaticCodeDemo1.getinstance();
	}

}
