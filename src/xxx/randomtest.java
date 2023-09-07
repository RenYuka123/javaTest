package xxx;

public class randomtest {
	public static void main(String[] args) {
		int r;

		// 0<=r<1
		System.out.println(Math.random());

		// 0<=r<10
		System.out.println((int) (Math.random() * 10));

		// 1<=r<=10
		r =((int)(Math.random()*11)+1);
		System.out.println(r);
		
		//0<=r<=10
		System.out.println((int) (Math.random() * 11));
	}
}
