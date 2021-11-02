package Object;

public class ObjectPair<k, v> {
	
	private k key;
	private v value;
	
	
	public ObjectPair(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}
	public <k,v> String dispaly() {
		return key +"  "+ value;
	}
	
	
	
}
