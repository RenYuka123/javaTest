package xxx;

import java.io.Serializable;

public class Cat implements Serializable, Zoo {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
