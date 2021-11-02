package Object;

public class ObjectClass {

	public static void main(String[] args) {
		
		ObjectPair<String,String > obj1 = new ObjectPair<String,String>("1","hello");
		ObjectPair<String, java.util.Date> obj2 = new ObjectPair<>("Toady is:",new java.util.Date());
		
		
		System.out.println(obj1.dispaly());
		System.out.println(obj2.dispaly());
		

	}

}
