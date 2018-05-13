package designmode;

public class Car_1 implements Car {
	private String pinpai;
	private String type;
	private String color;
	private float price;

	public Car_1(String pinpai, String type, String color, float price) {
		super();
		this.pinpai = pinpai;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public String getPinpai() {
		return pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public void Type() {
		// TODO Auto-generated method stub
		System.out.println(this.getType());
	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println(this.getColor());
	}

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println(this.getPrice());
	}

}
