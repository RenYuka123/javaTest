package xxx;

import static java.lang.System.out;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hw10 {
	public static void main(String[] args) {
		Hw10 hw = new Hw10();

		// 判斷質數
		hw.primenumber();

//		請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
//		(1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 
//		(提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
		hw.callnumber();

//		請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，
//		可以轉成想要的輸出格式化成
//		(1)年/月/日(2)月/日/年(3)日/月/年三選一，
//		而輸入非指定日期數字格式會顯示出提示訊息如圖
		hw.calldate();

	}

	public void primenumber() {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 5) {
			hs.add((int) (Math.random() * 100) + 1);
		}
		for (int number : hs) {
			boolean primenumber = true;
			if (number % 2 == 0 || number % 3 == 0) {
				primenumber = false;
			} else {
				int sqrt = (int) Math.floor(Math.sqrt(number));
				for (int j = 3; j <= sqrt; j++) {
					if (number % j == 0) {
						primenumber = false;
					}
				}
			}
			if(primenumber) {
				System.out.println(number+" 是質數");
			}else {
				System.out.println(number+" 不是質數");
			}
		}
	}

	public void callnumber() {
		Scanner sc = new Scanner(System.in);
		String regex = "^\\d+$";

		while (true) {
			System.out.println("輸入一個任意數");
			String number = sc.next();
			if (number.matches(regex)) {
				System.out.println("選擇要以下列何種表示方法顯示(1)千分位(2)百分比(3)科學記號");
				int choosenumber = sc.nextInt();
				printnumber(choosenumber, number);
				break;
			} else {
				System.out.println("重新輸入");
				sc.nextLine();
			}

		}
	}

	public void printnumber(int choosenumber, String number) {
		NumberFormat dfm1;
		switch (choosenumber) {
		case 1:
			dfm1 = new DecimalFormat("#,###");
			System.out.println(dfm1.format(Integer.valueOf(number)));
			break;
		case 2:
			dfm1 = NumberFormat.getPercentInstance();
			System.out.println(dfm1.format(Integer.valueOf(number)));
			break;
		case 3:
			dfm1 = new DecimalFormat("0.###E0");
			System.out.println(dfm1.format(Integer.valueOf(number)));
			break;
		default:
			System.out.println("選擇錯誤");
		}
	}

	public void calldate() {
		Scanner sc = new Scanner(System.in);
		String regex = "^\\d{8}$";

		while (true) {
			System.out.println("輸入一個日期");
			String datenumber = sc.next();
			if (datenumber.matches(regex)) {
				System.out.println("選擇要以下列何種表示方法顯示(1)年/月/日(2)月/日/年(3)日/月/年");
				int choosenumber = sc.nextInt();
				printdate(choosenumber, datenumber);
				break;
			} else {
				System.out.println("重新輸入");
				sc.nextLine();
			}

		}
	}

	public void printdate(int choosenumber, String datenumber) {
		DateFormat d;
		try {
			Date date = new SimpleDateFormat("yyyyMMdd").parse(datenumber);
			switch (choosenumber) {
			case 1:
				d = new SimpleDateFormat("yyyy/MM/dd");
				System.out.println(d.format(date));
				break;
			case 2:
				d = new SimpleDateFormat("MM/dd/yyyy");
				System.out.println(d.format(datenumber));
				break;
			case 3:
				d = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println(d.format(datenumber));
				break;
			default:
				System.out.println("選擇錯誤");
			}
		} catch (Exception e) {

		}
	}
}
