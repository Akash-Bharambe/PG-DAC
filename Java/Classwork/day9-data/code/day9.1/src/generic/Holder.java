package generic;

//Create a Holder class that can hold ANY data type : generic class example
//T : type (can be replaced by any letter)
//Can T be replace by 
//primitive type : NO
//ref type : YES
public class Holder<T> {
	private T ref;

	public Holder(T ref) {
		this.ref = ref;
	}
	public T getRef() {
		return ref;
	}

}
