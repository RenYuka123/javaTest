package xxx;

public class Animal {
	private int age;
	private float weight;
	
	//保留無參數的建構子
	public Animal() {
	//給子類別的對應
	//給日後搭配的工具(框架)使用，框架會利用此建構子幫我們建立物件
	}
	
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	public void speak() {
		System.out.println(age+"歲");
		System.out.println(weight+"公斤");
	}
	
	//因為需要修改實體變數，但建構子已無法再次使用，建立新的方法
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setWeight(float weight) {
		this.weight=weight;
	}
	
	public int getage() {
		return age;
	}
	
	public float getweight() {
		return weight;
	}
}
