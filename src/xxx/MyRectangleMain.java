package xxx;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle test1 = new MyRectangle();
		test1.setWidth(10);
		test1.setDepth(20);
		System.out.println(test1.getArea());
		
		
		MyRectangle test2 = new MyRectangle(10,20);
		System.out.println(test2.getArea());
	}
}
