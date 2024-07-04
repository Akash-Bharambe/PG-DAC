package practise.queue;

public class QueueImpl implements Queue {

	int[] queue;
	int size;
	int front;
	int rear;

	public QueueImpl(int size) {
		this.size = size;
		this.queue = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void enqueue(int value) {
		if (isFull()) {
			throw new RuntimeException("Queue is Full");
		}
		if (front == -1) {
			front = 0;
		}
		rear = (rear + 1) % size;
		queue[rear] = value;
	}

	@Override
	public Integer dequeue() {
		if (isEmpty()) {
			return null;
		}
		Integer value = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % size;
		}
		return value;
	}

	@Override
	public boolean isEmpty() {
		return front == -1;
	}

	@Override
	public boolean isFull() {
		return ((rear + 1) % size) == front;
	}

	@Override
	public Integer size() {
		if (front <= rear) {
			return rear - front + 1;
		} else if (isEmpty()) {
			return 0;
		}
		return size - front + rear + 1;
	}

	@Override
	public Integer peek() {
		if (isEmpty()) {
            return null;
        }
        return queue[front];
	}

}
