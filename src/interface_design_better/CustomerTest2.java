package interface_design_better;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		Computer2 c2 = new Computer2();
		Keyboard2 k1 = new Keyboard2();
		Mouse2 m1 = new Mouse2();
		
//		是因為 Keyboard2 類實作了 USB 接口，所以 k1 物件被當作 USB 類型的物件來處理。
		c2.setUSB(k1);
		c2.workWithUSB();
		
		c2.setUSB(m1);
		c2.workWithUSB();
		
		Printer2 p2 = new Printer2();
		c2.setUSB(p2);
		c2.workWithUSB();
		
	}
}
