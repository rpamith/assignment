package UnSupportedOper;

public class UnsupportedOperationException extends Exception  {
	
	public UnsupportedOperationException(String message) {
		super(message);
	}
	public UnsupportedOperationException(String message,Exception e) {
		super (message , e);
	}

}
