package xxx;

public class Hw9_Depoist {
	public static void main(String[] args) {
		Depoist depoist = new Depoist();
		Mom mom = new Mom(depoist);
		Son son = new Son(depoist);
		mom.start();
		son.start();

		try {
			mom.join();
			son.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Over");
	}
}

class Depoist {
	int amounts = 0;
	boolean stopmom = false;
	boolean stopson = false;

	synchronized public void momsetamounts(int money) {
		while (amounts >= 3000 && !stopmom) {
			System.out.println("帳戶超過3000 停止存款");
			notifyAll();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (!stopmom && amounts < 3000) {
			amounts += money;
			System.out.println("母親存款：" + money + "；帳戶：" + amounts);
			notifyAll();
		}

	}

	synchronized public void songetamounts(int money) {
		if(amounts <=2000) {
			System.out.println("帳戶低於2000 呼叫母親存款");
		}
		while (amounts < 1000 && !stopson) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
		if (!stopson) {
			amounts -= money;
			System.out.println("熊大提款：" + money + "；帳戶：" + amounts);
			notifyAll();
		}

	}

	public void stopmom() {

		stopmom = true;
	}

	public void stopson() {

		stopson = true;
	}
}

class Mom extends Thread {
	Depoist depoist;

	public Mom(Depoist depoist) {
		this.depoist = depoist;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			depoist.momsetamounts(2000);// 每次存入2000
		}
		if (!depoist.stopmom && depoist.stopson) {
			System.out.println("已存款10次");
		}
		depoist.stopson(); // 存款超出10次 通知另一方停止
	}
}

class Son extends Thread {
	Depoist depoist;

	public Son(Depoist depoist) {
		this.depoist = depoist;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			depoist.songetamounts(1000);// 每次提款1000
		}
		depoist.stopmom(); // 提款超出10次 通知另一方停止
		if (depoist.stopmom && !depoist.stopson) {
			System.out.println("已提款10次");
		}
	}

}