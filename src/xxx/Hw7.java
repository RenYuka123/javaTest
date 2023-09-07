package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Hw7 implements Zoo {
	public static void main(String[] args) {

//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		sample();

//		請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//				append功能讓每次執行結果都能被保存起來)
		try {
			ramdon();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，
//		第一個參數所代表的檔案會複製到第二個參數代表的檔案
		File Myfile = new File("C:\\javawork\\Sample.txt");
		File Copyfile = new File("C:\\javawork\\test.txt");
		copyFile(Myfile, Copyfile);

//		請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		objectnew();

//		承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
//		(請利用多型簡化本題的程式設計)
		try {
			inputobject();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void sample() {
		try {
			File myflie = new File("C:\\javawork\\Sample.txt");
			FileReader fos = new FileReader("C:\\javawork\\Sample.txt");
			BufferedReader br = new BufferedReader(fos);
			int totalchar = 0;
			int totalline = 0;
			String str;
			while ((str = br.readLine()) != null) {
				totalchar += str.length();
				totalline++;
			}
			System.out.println(myflie.length() + " bytes");
			System.out.println(totalchar + " char");
			System.out.println(totalline + " line");
			br.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ramdon() throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\javawork\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintWriter ps = new PrintWriter(bos);
		try {
			int i = 1;
			int number = 0;
			for (; i <= 10; i++) {
				number = (int) (Math.random() * 1000) + 1;
				ps.print(number + " ");
			}
			ps.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			bos.close();
			fos.close();
		}
		System.out.println();
	}

	public static void copyFile(File Myfile, File Copyfile) {
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，
//		第一個參數所代表的檔案會複製到第二個參數代表的檔案

		try {
			FileInputStream fis = new FileInputStream(Myfile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(Copyfile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int c;
			while ((c = bis.read()) != -1) {
				bos.write(c);
				bos.flush();
			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void objectnew() {
		File file = new File("C:\\data");
		try {
			if (!file.exists()) {
				file.mkdir();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		Dog dog = new Dog("A");
		Cat cat = new Cat("B");

		try {
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog);
			oos.writeObject(cat);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public static void inputobject() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Zoo) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
	}

	@Override
	public void speak() {

	}

}
