package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testhashset {
	public static void main(String[] args) {

		Set set = new HashSet();
		int number = 0;

//		for (int i = 1; i <= 6; i++) {
//			number = (int) (Math.random() * 49) + 1;
//			if (set.add(number) == false) {
//				i--;
//			} else {
//				set.add(number);
//			}
//		}

		while(set.size() != 6) {
			number = (int)(Math.random()*49)+1;
			set.add(number);
		}
		
		
		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}

	}

}
