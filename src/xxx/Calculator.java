package xxx;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		if(x==0 && y==0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y<0) {
			throw new CalException("次方為負值，回傳非整數");
		}else {
		this.x = x;
		this.y = y;
		}
	}

	public void setx(int x) throws CalException{
		if(x==0 && y==0) {
			throw new CalException("0的0次方沒有意義");
		}else {
			this.x = x;
		}
	}

	public void sety(int y)  throws CalException{
		if(y<0) {
		throw new CalException("次方為負值，回傳非整數");
		}else {
		this.y = y;}
	}

	public int getx() {
		return (x);
	}

	public int gety() {
		return (y);
	}
	
	public void calpow() {
		double pow = Math.pow(x, y);
		System.out.printf("%d的%d次方等於%.2f",x,y,pow);
	}
}
