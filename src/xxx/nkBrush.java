package xxx;

public class nkBrush extends Pen {
	public void write() {
		System.out.println("削鉛筆再寫");
	}

	public nkBrush(String brand, double price) {
		super(brand, price*0.9);
	}
	
	public void setprice(double price) {
		price = price*0.9;
		super.setprice(price);
	}
	
	public nkBrush(String brand) {
		super(brand);
	}
	
	public nkBrush(double price) {
		super(price);
	}
	
	public nkBrush() {
		super();
	}
}