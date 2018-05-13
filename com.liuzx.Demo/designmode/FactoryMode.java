package designmode;

public class FactoryMode {

	private static Car car = null;

	public static Car getInstance(String name) {
		if ("Car1".equals(name)) {
			car = new Car_1("����", "Vovol", "Yellow", 13000);
		}

		if ("Car2".equals(name)) {
			car = new Car_1("���Ǽ�", "��", "Red", 23000);
		}
		return car;

	}

}
