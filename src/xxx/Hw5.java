package xxx;

import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
		Hw5 hw5 = new Hw5();
		Scanner sc = new Scanner(System.in);

		// 使用者鍵盤輸入寬與高時，即會印出對應的*長方形
//		System.out.printf("請輸入寬:  %n");
//		int width = sc.nextInt();
//		System.out.printf("請輸入高:  %n");
//		int height = sc.nextInt();
//		hw5.starSquare(width,height);

//		從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
//		hw5.randAvg();

//		找出二維陣列的最大值並回傳
//		int[][] intarray = { { 1, 6, 3 }, { 9, 5, 2 } };
//		double[][] doublearray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//		System.out.println(hw5.maxElement(intarray));
//		System.out.println(hw5.maxElement(doublearray));

		hw5.genAuthCode();

	}

//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，
	public void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		// 變數宣告
		int[] ramdonarray = new int[10];
		int sum = 0;
		// 亂數產生
		System.out.print("亂數: ");
		for (int i = 0; i < ramdonarray.length; i++) {
			ramdonarray[i] = (int) (Math.random() * 101);
			// 檢查重複
			for (int j = 0; i > j; j++) {
				if (ramdonarray[i] == ramdonarray[j]) {
					i--;
				}
			}
			System.out.print(ramdonarray[i] + " ");
			sum += ramdonarray[i];
		}
		System.out.println();
		System.out.println("平均值:" + sum / ramdonarray.length);
	}

//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳

	public int maxElement(int x[][]) {
		int maxnumber = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxnumber < x[i][j]) {
					maxnumber = x[i][j];
				}
			}
		}
		return (maxnumber);
	}

	public double maxElement(double x[][]) {
		double maxnumber = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxnumber < x[i][j]) {
					maxnumber = x[i][j];
				}
			}
		}
		return (maxnumber);
	}

//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合

	public void genAuthCode() {
		System.out.println((int) 'a'); // 97 37
		System.out.println((int) 'z'); // 122 63
		System.out.println((int) 'A'); // 65 10
		System.out.println((int) 'Z'); // 90 36
		System.out.println((int) '0');
		System.out.println((int) '9');

		
		int [] array = new int [63];
		int [] ramdnarray = new int [8];
		for(int i =1 ;i<=8;i++) {
			int number = (int) (Math.random() * 63);
			if(number<10) {
				System.out.print(number);
			}else if(number <37) {
				System.out.print((char)(number+55));
			}else {
				System.out.print((char)(number+60));
			}
		}

	}
}
