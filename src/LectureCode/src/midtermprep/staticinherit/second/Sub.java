package midtermprep.staticinherit.second;

public class Sub extends Super {
	public static void main(String[] args) {  
		Super s = new Sub();
		s.print();
	}
	public static void print() {
		System.out.println("bye");
	}
}
