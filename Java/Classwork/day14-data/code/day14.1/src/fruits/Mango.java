package fruits;

public class Mango extends Fruit {
	@Override // is it mandatory to add this annotation ?
	//when can you add @Override ?
	//either for overriding method inherited from a super cls 
	//OR while imple abstract method from the i/f
	public void taste() {
		System.out.println("sweet in taste!");
	}

	public void pulp() {
		System.out.println("extrating Mango pulp...");
	}
}
