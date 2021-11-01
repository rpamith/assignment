package persistance;

public class saved {
	public static void main(String[] args){
		
		persistance obj1 = new Filepersistance();
		persistance obj2 = new Databasepersistance();
		
		obj1.persist();
		obj2.persist();
	}

}
