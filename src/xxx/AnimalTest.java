package xxx;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal cat = new Animal(2,(float) 5.0);
		cat.speak();
		cat.setAge(8);
		System.out.println("=================");
		cat.setWeight(8.0f);
		cat.speak();
		
		System.out.println("=================");
		
		Elephant elp = new Elephant(3,1200.0f,"大象");
		elp.speak();
		Animal   ani = new Animal(3,8.0f);
		ani.speak();
		
	}
}
