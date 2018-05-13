package designmode;

public class FactoryMode {

	private static Car car = null;

	public static Car getInstance(String name) {
		if ("Car1".equals(name)) {
			car = new Car_1("¼ªÀû", "Vovol", "Yellow", 13000);
		}

		if ("Car2".equals(name)) {
			car = new Car_1("±ÈÑÇ¼ª", "ÇØ", "Red", 23000);
		}
		return car;

	}

}
