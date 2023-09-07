package xxx;

public class TestPen {
	public static void main(String[] args) {
		Pen pencil = new Pencil("A", 100);
		Pen nkbrush = new nkBrush("B", 100);
		

		pencil.write();
		System.out.println(pencil.getprice());

		
		nkbrush.write();
		System.out.println(nkbrush.getprice());

	}
}
