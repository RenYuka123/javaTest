package xxx;

public class Student {
	// 實體變數
	int scores;

	// 建立方法
	//每休息一個小時，score就會減1
	public void play(int hours) { // 不回傳 且需要參數
		scores -= hours;
		System.out.println("每休息" + hours + "小時 " + scores + "分數");
	}
	//每讀書一個小時，score就會加1
	public void study(int hours) { // 不回傳 且需要參數
		scores += hours;
		System.out.println("每讀書" + hours + "小時 " + scores + "分數");
	}

	// main 方法 測試
	public static void main(String[] args) {
		// 建立新物件
		Student stu1 = new Student();
		Student stu2 = new Student();
		// 給予屬性
		stu1.scores = 50;
		stu2.scores = 60;
		// 呼叫方法
		stu1.play(10);
		stu2.play(10);
		System.out.println();
		stu1.study(10);
		stu2.study(10);

	}
}
