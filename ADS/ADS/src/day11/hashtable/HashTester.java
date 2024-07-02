package day11.hashtable;

public class HashTester {

	public static void main(String[] args) {
		HashTable hashTable = new HashTableImpl();
	
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			hashTable.insert(i+1);
		}
		long end = System.currentTimeMillis() - start;
		
		System.out.println("Time taken to insert 10000 elements: "+end);
		
		System.out.println("10 "+(hashTable.search(10)?"found":"not found"));
		System.out.println("20 "+(hashTable.search(20)?"found":"not found"));
		System.out.println("1 "+(hashTable.search(1)?"found":"not found"));
		System.out.println("-1 "+(hashTable.search(-1)?"found":"not found"));
		hashTable.display();
	}

}
