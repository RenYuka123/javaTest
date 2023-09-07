package test1;



public class TestWeight {
	public static void main(String[] args) {
		Weight [] arrayweight = new Weight[3] ; //產生的是陣列物件  (介面是無法產生物件
		arrayweight[0] = new Dog("ken",5.0);
		arrayweight[1]= new Plane("airplane",5000);
		arrayweight[2] = new Powder("white",60);
		for(int i =0;i<arrayweight.length;i++) {
			arrayweight[i].getWeightTool();
		}
		
	}
}
