package Contact;

public class Contact {
	
	long Phonenumber ;
	String Name;
	String Email;
	String Gender;
	
	public Contact(long Phonenumber , String Name , String Email , String Gender) {
		super();
		this.Phonenumber = Phonenumber;
		this.Name = Name;
		this.Email = Email;
		this.Gender = Gender;
	}
	
	@Override
	public String toString() {
		return"[Phonenumber="+ Phonenumber +", Name =" + Name +",Email =" + Email +", Gender ="+Gender +"]" + "\n";
	}

}
