package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		System.out.println("輸出此陣列所有元素的平均值與大於平均值的元素");
//		elementscompare(userintarray());

//		字串，經過程式執行後，輸入結果是反過來的
		System.out.println("字串，經過程式執行後，輸入結果是反過來的");
		stringconve();

//		計算出這陣列裡面共有多少個母音
//		System.out.println("陣列裡面共有多少個母音");
//		calculatevoewl(userstringarray());

//		輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數
//		System.out.println("輸入欲借的金額");
//		int money = sc.nextInt();
//		barrowmoney(money);

//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		System.out.println("請輸入西元年 月 日");
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		daycalculate(year,month,day);

//		算出每位同學考最高分的次數
		System.out.println("算出每位同學考最高分的次數");
		testcalculate();

	}

	public static void elementscompare(int[] array) {
		int avg, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println("元素的平均值:" + avg);
		System.out.println("大於平均值的元素");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > avg) {
				System.out.print(array[i] + " ");
			}
		}
	}

	public static int[] userintarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入整數陣列的長度：");
		int length = sc.nextInt(); // 陣列長度
		int[] array = new int[length];
		System.out.println("請輸入整數：");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("陣列：");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		return array;

	}

	public static void stringconve() {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入字串");
		String s = sc.nextLine(); // 使用者輸入
		int[] string = new int[s.length()]; // 放字元陣列
		int[] conversstring = new int[s.length()]; // 相反陣列
		for (int i = 0; i < string.length; i++) {
			string[i] = s.charAt(i);
			conversstring[string.length - 1 - i] = s.charAt(i);
		}

//		for (int i : string) {
//			System.out.print((char) i);
//		}
		System.out.println();
		for (int i : conversstring) {
			System.out.print((char) i);
		}
	}

	public static String[] userstringarray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入字串陣列的長度(幾個單字)：");
		int length = sc.nextInt(); // 陣列長度
		String[] array = new String[length];
		System.out.println("請輸入字串：");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		System.out.println("陣列：");
		for (String i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		return array;
	}

	public static void calculatevoewl(String[] array) {
		int[] vowel = new int[5]; // a0 e1 i2 o3 u4
		int counts = 0; // 總數量
		// 計算母音數量
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				switch (array[i].charAt(j)) {
				case 'a':
					vowel[0]++;
					break;
				case 'e':
					vowel[1]++;
					break;
				case 'i':
					vowel[2]++;
					break;
				case 'o':
					vowel[3]++;
					break;
				case 'u':
					vowel[4]++;
					break;
				default:
					break;
				}
			}

		}
		System.out.println("各個母音數量：");
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < vowel.length; i++) {
			System.out.printf("%c: %d ", vowels[i], vowel[i]);
			counts += vowel[i];
		}
		System.out.println();
		System.out.printf("總數量:%d %n ", counts);
	}
	
	//ArrayList 動態 (改良)
	public static void barrowmoney(int money) {
		int[][] register = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		// 計算可借錢的人數
		int count = 0;
		for (int i = 0; i < register.length; i++) {
			for (int j = 1; j < register[i].length; j++) {
				if (money <= register[i][j]) {
					count++;
				}
			}
		}

		// 名單設立
		int[][] people = new int[count][2];
		int index = 0;
		for (int i = 0; i < register.length; i++) {
			if (money <= register[i][1]) {
				for (int j = 0; j < 2; j++) {
					people[index][j] = register[i][j];
				}
				index++;
			}
		}

		// 結果顯示
		System.out.println("可借錢的員工編號及現有金錢");
		for (int[] x : people) {
			if (x[1] > 0) {
				System.out.printf("員工編號：%d 金錢：%d%n", x[0], x[1]);
			}
		}
		System.out.println("總人數:" + count);
	}

	public static void daycalculate(int year, int month, int day) {
		Scanner sc = new Scanner(System.in);
		int todays = 0;
		int[] normalyear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapyear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 != 0) { // 不被4整除 平年
			for (int i = 0; i < month - 1; i++) {
				todays += normalyear[i];
			}
			todays += day;
		} else if (year % 100 != 0) { // 被4整除 不被100整除 閏年
			for (int i = 0; i < month - 1; i++) {
				todays += leapyear[i];
			}
			todays += day;
		} else if (year % 400 != 0) { // 被4整除 被100整除 不被400整除 平年
			for (int i = 0; i < month - 1; i++) {
				todays += normalyear[i];
			}
			todays += day;
		} else { // 被4整除且 被100整除，且 被400整除 閏年
			for (int i = 0; i < month - 1; i++) {
				todays += leapyear[i];
			}
			todays += day;
		}
		System.out.println(todays);
	}

	// 計算6次考試有幾個最高分(計次)
	public static void testcalculate() {
		int[][] testpoint = { { 10, 35, 40, 90, 90, 85, 99, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int maxpoint = -1;
		int[] bestpeoplenumber = new int[48];
		int index = 0;
		int people = 0; // 計次
		int totals = 0; // 總人數
		for (int i = 0; i < testpoint.length; i++) { // 1~6次考試
			for (int j = 0; j < testpoint[i].length; j++) { // 找最高分
				if (testpoint[i][j] > maxpoint) {
					maxpoint = testpoint[i][j];
					people = 1;
				} else if (testpoint[i][j] == maxpoint) {
					maxpoint = testpoint[i][j];
					people++;
				}
			}
			totals += people;
			for (int j = 0; j < testpoint[i].length; j++) { // 跟最高分相同的人放入陣列
				if (testpoint[i][j] == maxpoint) {
					bestpeoplenumber[index] = j;
					index++;
				}
			}
			maxpoint = -1; // 初始化最大值
		}

		for (int i = 0; i < totals; i++) {
			System.out.print(bestpeoplenumber[i] + " ");
		}

		// 計算每個人最高分次數
		System.out.println();
		int array2[] = new int[9];
		for (int i = 0; i < totals; i++) {
			int num = bestpeoplenumber[i]; // 6
			array2[num + 1]++;
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > 0) {
				System.out.printf(" %d 號 %d 次最高分 ", i, array2[i]);
			}
		}
	}
}