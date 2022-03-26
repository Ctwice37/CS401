package midterm.subclassprob.packageA;
public abstract class ClassA {
	public static ClassA create(String s) {
		return s.equals("1") ? new Subclass1() : new Subclass2();
	}
}
