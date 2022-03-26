package midterm.subclassprob.packageB;

import midterm.subclassprob.packageA.ClassA;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassA cl1 = ClassA.create("1");
		ClassA cl2 = ClassA.create("2");
		
	}
}
