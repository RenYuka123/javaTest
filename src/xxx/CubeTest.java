package xxx;

import java.util.Scanner;

public class CubeTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		while(sc.hasNext())
		try {
			Cube cube1 = new Cube(length);
			System.out.println(cube1.getvolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

	
}
