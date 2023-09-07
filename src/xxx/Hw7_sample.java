package xxx;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Hw7_sample {
	public static void main(String[] args) throws FileNotFoundException {
		File myflie = new File("C:\\javawork\\Sample.txt");
		FileReader fos = new FileReader("C:\\javawork\\Sample.txt");
		BufferedReader br = new BufferedReader(fos);

		try {
			int totalchar = 0;
			int totalline = 0;
			String str;
			while ((str = br.readLine()) != null) {
				totalchar += str.length();
				totalline++;
			}
			System.out.println(myflie.length() + "bytes");
			System.out.println(totalchar + "char");
			System.out.println(totalline + "line");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ramdonnumber() throws FileNotFoundException {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\javawork\\Data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			int i = 1;
			int number = 0;
			for (; i <= 10; i++) {
				number = ((int) Math.random() * 1000) + 1;
				ps.write(number);
			}
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}