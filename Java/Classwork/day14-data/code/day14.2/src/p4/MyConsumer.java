package p4;

import java.util.function.Consumer;

public class MyConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T o) {
		System.out.println(o);
		
	}
}
