package xxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Train implements Comparable {
//	班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

//	設計對應的getter/setter方法

	public void setnumber(int number) {
		this.number = number;
	}

	public void settype(String type) {
		this.type = type;
	}

	public void setstart(String start) {
		this.start = start;
	}

	public void setdest(String dest) {
		this.dest = dest;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public int getnumber() {
		return number;
	}

	public String gettype() {
		return type;
	}

	public String getstart() {
		return start;
	}

	public String getdest() {
		return dest;
	}

	public double getprice() {
		return price;
	}

	// 建構子
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public Train() {

	}

	// main方法
	public static void main(String[] args) {

		Train[] train = new Train[7];
		train[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t = new Train();
		//不重複的Train物件
		t.notduplicatetrain(train);
		
		//讓Train物件印出時，能以班次編號由大到小印出
		t.desctrainArrayList(train);
		
		//班次編號由大排到小印出， 還可以不重複印出Train物件
		t.desctrainHashSettoArrayList(train);
		
		t.desctrainTreeSet(train);
	}

	// HashSet	無順序重複(不重複 Override hashcode equals)
	public void notduplicatetrain(Train[] train) {
		HashSet<Train> hashset = new HashSet<Train>();
		int i = 0;
		while (i != train.length-1) {
			hashset.add(train[i]);
			i++;
		}

		// for each
		System.out.println("for each");
		for (Object obj : hashset) {
			System.out.println(obj);
		}

		System.out.println();

		// Iterator
		System.out.println("Iterator");
		Iterator<Train> it = hashset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	// ArrayList 重複且大小排序(Override )
	public void desctrainArrayList(Train[] train) {
		ArrayList<Train> al = new ArrayList<Train>();
		int i = 0;
		while (i != train.length-1) {
			al.add((Train) train[i]);
			i++;
		}

		Collections.sort(al);

		// for each
		System.out.println("for each");
		for (Train obj : al) {
			System.out.println(obj);
		}

		System.out.println();

		// Iterator
		System.out.println("Iterator");
		Iterator<Train> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// for
		System.out.println();
		System.out.println("for");
		for (int j = 0; j < al.size(); j++) {
			System.out.println(al.get(j));
		}
	}

	// 將唯一性的HashSet傳入ArrayList 完成不重複且大小排序 (無順序不重複->順序不重複)
	public void desctrainHashSettoArrayList(Train[] train) {
		HashSet<Train> hashset = new HashSet<Train>();
        int i = 0;
        while (i != train.length-1) {
            hashset.add(train[i]);
            i++;
        }
        
        //將結果轉成物件陣列 呼叫desctrainArrayList方法
        	
        //0731 api public <T> T[] toArray(T[] a) 
//        如果數組的長度不足以容納 List 中的所有元素，toArray() 方法會創建一個新的指定類型的數組，
//        如果數組的長度足夠，則將元素填充到已有的數組中。
//        而在傳遞一個長度為 0 的數組時，toArray() 方法會創建一個新的數組，
//        其長度等於 List 中元素的個數，這樣可以避免在創建數組時浪費空間。
        Train[] noarrange = hashset.toArray(new Train[hashset.size()]);
//        Train[] noarrange = hashset.toArray(new Train[0]);
        desctrainArrayList(noarrange);

	}
	
	//TreeSet 不重複且大小排序(Override)
	public void desctrainTreeSet(Train[] train) {
		TreeSet<Train> ts = new TreeSet<Train>();
		int i = 0;
		while (i != train.length-1) {
			ts.add(train[i]);
			i++;
		}
		
		//for each
		System.out.println("for each");
		for (Object obj : ts) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		// Iterator
		System.out.println("Iterator");
		Iterator<Train> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	//使用物件陣列關係 印出會是記憶體位址 override toString
	@Override
	public String toString() {
		return "Train " + number + ": " + type + " from " + start + " to " + dest + ", Price: " + price;
	}

	// hashset 物件唯一性(不重複) override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result * number;
		result = (int) (prime * result * price);
		result = prime * result * (type == null ? 0 : type.hashCode());
		result = prime * result * (start == null ? 0 : start.hashCode());
		result = prime * result * (dest == null ? 0 : dest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if (this.dest.equals(t.dest) && this.number == t.number && this.start.equals(t.start)
					&& this.type.equals(t.type) && this.price == t.price) {
				return true;
			}
		}
		return false;
	}

	
	// List TreeSet 自訂物件大小排序 override
	@Override
	public int compareTo(Object obj) {
		Train t = (Train) obj;
		if (this.number > t.number) {
			return -1;
		} else if (this.number < t.number) {
			return 1;
		} else {
			return 0;
		}
	}

}
