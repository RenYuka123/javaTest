package xxx;

public class MyRectangle {
	private double width;
	private double depth;
	
	 void setWidth(double width) {
		this.width = width;
	}
	
	 void setDepth(double depth) {
		this.depth = depth;
	}
	
	 double getArea() {
		double area = depth *width;
		return(area);
	}
	
	 public MyRectangle() {
		 
	 }
	
	 public MyRectangle(double width, double depth) {
		 setWidth(width);
		 setDepth(depth);
	 }
	 
}
