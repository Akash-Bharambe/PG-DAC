package strings;

import java.util.Date;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1);//hello
		System.out.println(sb1.length()+" "+sb1.capacity());//5 21
		StringBuilder sb2=sb1.append(true).append('A')
		.append(123.45F).append(new Date());
		System.out.println(sb2);
		System.out.println(sb1==sb2);//t
		sb2.insert(0, "A new string ");
		System.out.println(sb1);
		//deletes the chars from index : start ---end-1
		sb1.delete(0,sb2.length());
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println("sb1 : "+sb1);
		System.out.println(sb1.length()+" "+sb1.capacity());//0 capa
		sb1.trimToSize();
		System.out.println(sb1.length()+" "+sb1.capacity());//0 0
		

	}

}
