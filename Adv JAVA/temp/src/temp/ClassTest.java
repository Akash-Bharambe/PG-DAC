package temp;


public class ClassTest {

	public static void main(String[] args) {
		try {
			throw new StringIndexOutOfBoundsException();
		}catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}

	}

}
