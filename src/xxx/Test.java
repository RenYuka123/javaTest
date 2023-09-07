package xxx;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// 多型宣告在編譯階段時, Java利用資料型別(也就是class)來檢查呼叫的方法是否存在
		SmartPhone sp = new IPhone();
		try {
			// 執行子類別方法(也就是dynamic binding)
			sp.sendSMS();
			// 編譯時只檢查到父類別的方法, 所以不可以拋出比父類別還高階的例外, 會導致程式無法處理
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
