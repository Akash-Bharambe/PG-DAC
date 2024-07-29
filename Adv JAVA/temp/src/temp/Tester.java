package temp;

import java.util.ArrayList;
import java.util.List;

class Worker {
}

class TempWorker extends Worker {
}

class PermWorker extends TempWorker {
}

public class Tester {
	public static void addWorker(List<? extends Worker> list) {
		list.add(new Worker());
		list.add(new TempWorker());
		list.add(new PermWorker());
		list.add(new Object());
	}

	public static void main(String[] args) {
		List<TempWorker> workerList = new ArrayList<>();
		List<Worker> workers = new ArrayList<Worker>();
		addWorker(workers);
		addWorker(workerList);
	}
}
