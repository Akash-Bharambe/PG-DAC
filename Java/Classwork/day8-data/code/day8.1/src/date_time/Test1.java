package date_time;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);//curnt date n time
		Date d2=new Date(10000);
		System.out.println(d2);//date n time - 10secs after epoch
		System.out.println(d1.before(d2));//f
		System.out.println(d1.equals(d2));//f
		System.out.println(d1.compareTo(d2));// > 0 (+1)

	}

}
