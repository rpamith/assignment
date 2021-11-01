package StringBuilder;

public class Insertion {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("It is used to at the specifed index position");
		a.insert(14, "insert text");
		System.out.println("AFTER INSERTION::"+a);
	}

}
