package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		System.out.println("三角形測試");
		triangletest();

		System.out.println("========================");
		System.out.println("猜數字0~9");
		guessnumber();

		System.out.println("========================");
		System.out.println("猜數字0~100");
		guessnumber100();

		System.out.println("========================");
		System.out.println("樂透討厭數字");
		lotteryguess();

		System.out.println("========================");
		System.out.println("6亂數");
		lotteryrandom();
	}

	// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
	public static void triangletest() {
		Scanner sc = new Scanner(System.in);
		double[] data = new double[3];
		System.out.println("請輸入3個數字");
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextDouble();
		}
		Arrays.sort(data); //
		if (data[0] <= 0 || data[0] + data[1] > data[2]) {
			System.out.println("這不是三角形");
		} else if (data[0] * data[0] + data[1] * data[1] == data[2] * data[2]) {
			System.out.println("直角三角形");
		} else if (data[0] == data[1] || data[1] == data[2]) {
			if (data[0] < data[1] || data[1] < data[2]) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("正三角形");
			}
		} else {
			System.out.println("其他三角形");
		}
	}

	// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
	public static void guessnumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入0~9整數");
		int answer = (int) (Math.random() * 10);
		double number = sc.nextDouble();
		while (answer != number) {
			if (number < 0 || number % 1 != 0 || number > 9) {
				System.out.println("請輸入0~9整數");
			} else {
				System.out.println("猜錯了");
				System.out.println("請輸入0~9整數");
			}
			number = sc.nextDouble();
		}
		System.out.println("猜對了");
	}

	// 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
	public static void guessnumber100() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入0~100整數");
		int answer = (int) (Math.random() * 101);
		int number = sc.nextInt();
		while (answer != number) {
			if (number < 0 || number > 100) {
				System.out.println("請輸入0~100整數");
			} else {
				if (answer > number) {
					System.out.println("猜錯了 小於正確答案");
				} else {
					System.out.println("猜錯了 大於正確答案");
				}
			}
			number = sc.nextInt();
		}
		System.out.println("猜對了");
	}

//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
	public static void lotteryguess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請討厭的整數(1~9)");
		int hatenumber = sc.nextInt(); // 3
		int count = 0; //
		while (hatenumber <= 0 || hatenumber > 9 || hatenumber % 1 != 0) {
			System.out.println("請輸入1~9整數");
			hatenumber = sc.nextInt();
		}
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != hatenumber && (i < hatenumber * 10 || i >= (hatenumber + 1) * 10)) {
				System.out.print(i + "\t");
				count++;
			}
			if (count % 6 == 0) {
				System.out.println();
			}
		}
		System.out.print("可選數字為" + count);
	}

//	輸入不要的數字後，直接亂數印出6個號碼且不得重複  
	public static void lotteryrandom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請討厭的整數(1~9)");
		double hatenumber = sc.nextDouble(); // 3
		int count = 0; //
		while (hatenumber <= 0 || hatenumber > 9 || hatenumber % 1 != 0) {
			System.out.println("請輸入1~9整數");
			hatenumber = sc.nextDouble();
		}
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != hatenumber && (i < hatenumber * 10 || i >= (hatenumber + 1) * 10)) {
				System.out.print(i + "\t");
				count++;
			}
			if (count % 6 == 0) {
				System.out.println();
			}
		}
		System.out.print("可選數字為" + count);

		System.out.println();

		// 將剩下的數字 放入新的陣列
		int copyarray[] = new int[count];
		int copyarrayindex = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != hatenumber && (i < hatenumber * 10 || i >= (hatenumber + 1) * 10)) {
				copyarray[copyarrayindex] = i;
//				System.out.print(copyarray [copyarrayindex] + "\t");  //檢查跟上面是不是一樣的
				copyarrayindex++;
			}
			if (copyarrayindex % 6 == 0) {
				System.out.println();
			}

		}
		// 亂數抽6個
		int random;
		int[] arynum = new int[6]; // 將抽的元素 放入新的陣列
		for (int i = 0; i < 6; i++) {
			random = (int) (Math.random() * count) + 1;
			arynum[i] = copyarray[random];
//			System.out.print(copyarray[random]+" ");
			for (int j = 0; j < i; j++) { // 下個元素 跟 上個元素 做比較 01 012 0123 01234
				if (arynum[i] == arynum[j]) { // 一樣就重抽
					i--;
				}
			}
		}
		// 亂數陣列
		System.out.println();
		for (int i = 0; i < arynum.length; i++) {
			System.out.print(arynum[i] + " ");
		}
	}
}
