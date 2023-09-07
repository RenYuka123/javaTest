package xxx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Hw7_others {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintWriter ps = new PrintWriter(bos);
			StringBuilder sb = new StringBuilder();
			int i = 1;
			int number = 0;
			for (; i <= 10; i++) {
				number = (int) (Math.random() * 1000) + 1;
				ps.println(number);
			}
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
