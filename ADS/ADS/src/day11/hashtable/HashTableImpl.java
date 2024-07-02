package day11.hashtable;

import java.util.ArrayList;

public class HashTableImpl implements HashTable {

	int hashTableSize;
	ArrayList<Integer>[] buckets;

	@SuppressWarnings("unchecked")
	public HashTableImpl() {
		this.hashTableSize = 10;
		this.buckets = new ArrayList[hashTableSize];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
	}

	private int modN(Integer key) {
//		return Math.abs(key % hashTableSize);
		return Math.abs(key.hashCode() % hashTableSize);
	}

	@Override
	public void insert(int key) {
		int id = modN(key);

		buckets[id].add(key);
	}

	@Override
	public boolean search(int key) {
		int id = modN(key);
		return buckets[id].contains(key);
	}

	@Override
	public void display() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.print("Bucket " + (i + 1) + ": ");
			System.out.println(buckets[i]);
		}
	}

}
