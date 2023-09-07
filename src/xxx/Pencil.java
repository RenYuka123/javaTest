package xxx;

public class Pencil extends Pen {
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, double price) {
		super(brand,price*0.8);
	}
	
	public void setprice(double price) {
		price = price*0.8;
		super.setprice(price);
	}
	public Pencil(String brand) {
		super(brand);
	}
	
	public Pencil(double price) {
		super(price);
	}
	
	public Pencil() {
		super();
	}
	
}
