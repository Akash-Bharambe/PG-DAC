package non_generic;

//Create a Holder class that can hold ANY data type
public class Holder {
	private Object ref;

	public Holder(Object ref) {
		this.ref = ref;
	}
	public Object getRef() {
		return ref;
	}

}
