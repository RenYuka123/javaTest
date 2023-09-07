package xxx;

public class Elephant extends Animal {
	private String name;

	public Elephant() {
		
	}
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

//	override
	public void speak() {
		super.speak();
		System.out.println(name);
	}
	
	//Anootation (標註) 給JAVA工具或框架的資訊
//	@Override 給編譯器的資訊，讓編譯器對此方法是用override規則檢查(安全)
//	public void speak() {
//		super.speak();
//		System.out.println(name);
//	}
	
	//編譯成功，但不符合override規則
	//因為編譯器，視為overloading
//	public void speak(int data ) {
//		super.speak();
//		System.out.println(name);
//	}
	
	public static void main(String[] args) {
		System.out.println("=================");
		
		Elephant elp = new Elephant(3,1200.0f,"大象");
		Animal   ani = new Animal(3,8.0f);
		
		elp.speak();
		System.out.println("=================");
		ani.speak();
	}
}
