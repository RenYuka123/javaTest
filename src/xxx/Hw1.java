package xxx;

public class Hw1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int x = 12, y = 6;
		System.out.println("和=" + (x + y) + " 積=" + x * y);

//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int total = 200, dozen, piece;
		dozen = total / 12;
		piece = total % 12;
		System.out.println("200顆蛋共是" + dozen + "打" + piece + "顆");

//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total_s = 256559, day, hour, min, sec;
		day = total_s / (60 * 60 * 24); // 256559秒為2天
		hour = total_s % (60 * 60 * 24) / (60 * 60); // 256559秒為2天23小時 (取天餘數 轉換成小時)
		min = total_s % (60 * 60) / 60; // 256559秒為2天23小時15分 (取小時餘數 轉換成分)
		sec = total_s % 60; // (取分餘數)
		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");

//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//		  園面積=半徑x半徑x3.14 圓周長=直徑乘以 圓周率
		double pi = 3.1415, perimeter, area;
		int radius = 5;
		perimeter = radius * 2 * pi;
		area = Math.pow(radius, 2) * pi;
		System.out.println("半徑為5的圓面積=" + area + " 圓周長=" + perimeter);

//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
//		FV 期末本利和 ＝ PV 期初本金×（1 ＋ R）n 期數 次方

		int pv = 1500000;
		double irate = 0.02;
		double fv = pv * (1 + irate); // 第1年期末本利和
//		System.out.println(Math.pow(1+irate, 10)*pv);
		for (int n = 2; n <= 10; n++) { // 2~10年期末本利和
			fv = fv * (1 + irate);
		}
		System.out.println("10年後，本金加利息共有" + (int) fv);

//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因

//		5+5 2個都分別為整數常數 故會直接做數值運算 10
		System.out.println(5 + 5);

//		5 為整數常數 '5'為字元char  故會先將'5'做int轉換(53) 所以 5+53=58
		// System.out.println((int)'5');
		System.out.println(5 + '5');

//		5 為整數常數 "5"為字串String 故2者相加 會形成字串串接 55 
		System.out.println(5 + "5");

	}
}
