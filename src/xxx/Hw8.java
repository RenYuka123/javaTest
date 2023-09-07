package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hw8 {
	public static void main(String[] args) {
		//1
		printcollection();
		
		
	}
	
	public static void printcollection() {
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short((short)100));
		list.add(new Double(5.1));
		list.add(new String("Kitty"));
		list.add(new Integer(100));
		list.add(new String("Snoopy"));
		list.add(new BigInteger("1000"));
		
		System.out.println("迭代器");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		System.out.println("for迴圈");
		for(int i =0 ;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
		System.out.println();
		
		System.out.println("for each");
		for(Object obj : list) {
			if(obj instanceof Number) {
				System.out.print(obj+" ");
			}else if(obj instanceof String) {
				System.out.print(obj+" ");
			}else if(obj instanceof Object) {
				System.out.print(obj+" ");
			}
		}
		
		System.out.println();
		
//		移除不是java.lang.Number相關的物件
		System.out.println("移除不是java.lang.Number相關的物件");
		for(Object obj : list) {
			if(obj instanceof Number) {
				System.out.print(obj+" ");
			}

		}
	}




}
