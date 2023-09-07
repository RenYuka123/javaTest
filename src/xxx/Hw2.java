package xxx;

public class Hw2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1～1000的偶數和=" + sum);

		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum1 = 1;
		for (int i = 1; i <= 10; i++) {
			sum1 *= i;
		}
		System.out.println("1～10的連乘積=" + sum1);

		System.out.println();

		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum2 = 1;
		int n = 1;
		while (n <= 10) {
			sum2 *= n;
			n++;
		}
		System.out.println("1～10的連乘積=" + sum2);

		// 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100 (1*1 2*2...10*10)
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + "\t");
		}

		System.out.println();

		// 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		// 4 14 24 34 44 (10 10 10 10) 41~49
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i > 39) {
			} 
			else {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.print("總共有" + count);

		System.out.println();

		// 請設計一隻Java程式，輸出結果為以下
		for (int i = 10; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		// 請設計一隻Java程式，輸出結果為以下：
		System.out.print((int) 'A'); // 65
		System.out.print((int) 'F'); // 70
		System.out.println();
		int simble = (int) 'A'; // 65
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) simble + " ");
			}
			simble++;
			System.out.println();
		}

//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				switch (i) {
//				case 1:
//					System.out.print("A");
//					break;
//				case 2:
//					System.out.print("B");
//					break;
//				case 3:
//					System.out.print("C");
//					break;
//				case 4:
//					System.out.print("D");
//					break;
//				case 5:
//					System.out.print("E");
//					break;
//				default:
//					System.out.print("F");
//				}
//
//			}
//			System.out.println();
//		}

	}
}
