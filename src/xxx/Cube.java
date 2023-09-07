package xxx;

public class Cube {

	private double length;

	public Cube(double length) throws CubeException {
//		if(length<=0) {
//			throw new CubeException("邊長不得<=0");
//		}else
//		this.length = length;
		setlength(length);
	}
	
	public void setlength(double length)throws CubeException {
		if(length<=0) {
			throw new CubeException("邊長不得<=0");
		}else
		this.length = length;
		
	}
	
	public double  getlength() {
		return(length);
	}
	
	public double getvolume() {
		double area = Math.pow(length, 3);
		return(area);
	}
}
