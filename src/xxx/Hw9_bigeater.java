package xxx;

public class Hw9_bigeater implements Runnable {
//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示

	private int counts = 0;
	private String name;

	public Hw9_bigeater(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		Hw9_bigeater p1 = new Hw9_bigeater("饅頭人");
		Hw9_bigeater p2 = new Hw9_bigeater("詹姆士");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		System.out.println("大胃王比賽結束");
	}

	@Override
	public synchronized void run() {
		while (counts < 10) {
			System.out.println(name + "吃完第" + counts + "碗");
			counts++;
			int ramdon = (int) (Math.random() * 5000) + 500;
			try {
				Thread.sleep(ramdon);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完第" + counts + "碗");
		System.out.println(name + "完食");

	}
}
