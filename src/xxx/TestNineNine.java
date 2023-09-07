package xxx;

public class TestNineNine {
	public static void main(String[] args) {
		// for + while
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j+"\t");
				j++;
			}
			System.out.println();
		}

		// for + do whlie
		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j+"\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		

		// while + do while
		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j+"\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}

	}
}
