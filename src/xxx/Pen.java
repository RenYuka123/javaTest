package xxx;

public abstract class Pen {
	private String brand;
	private double price;

	public  Pen() {

	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getprice() {
		return (price);
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return (brand);
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public Pen(String brand) {
		this(brand, 0);
	}

	public Pen(double price) {
		this("-", price);
	}
	
	public abstract void write();
}

