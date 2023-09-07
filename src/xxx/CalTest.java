package xxx;

import java.util.InputMismatchException;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		放在try外面的話
//		InputMismatchException 發生時，
//		Scanner 仍保留錯誤輸入，
//		導致下一次 nextInt() 方法仍會讀到錯誤輸入，
//		再次丟出 InputMismatchException 例外，
//		無限循環。
//		所以需要手動清除scanner
		
//		next() and nextLine()
//		只有C是要求輸入的  
//		int c = sc.nextInt();
//		sc.nextLine();
		
		
		while (true) {
			try {
				//放在裡面 保證清除(改新的物件)錯誤輸入 但會一直建立新的物件，直到輸入正確跳出迴圈
//				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入X值");
				int x = sc.nextInt();
				System.out.println("請輸入Y值");
				int y = sc.nextInt();
				Calculator cal = new Calculator(x, y);
				cal.calpow();
				break;
			} catch (CalException e) {
				System.out.println(e);
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");

				sc.nextLine();
				//取得使用者輸入或檔案內容中的字串
//				 x = sc.nextInt(); and y = sc.nextInt();
				//讀取並回傳scanner的內容，但我們沒有指定給任何變數，所以回傳值會被丟棄
//				Returns:the line that was skipped //API文件 nextLine()
//				假如Scanner sc = new Scanner(System.in)放在外面
//				所以要手動釋放錯誤輸入
			}
		}
		//手動關閉
		sc.close();
	}
}
