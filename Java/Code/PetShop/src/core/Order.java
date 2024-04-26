package core;

import java.util.Random;

public class Order {
	
	private int orderId;
	private int petId;
	private int quantity;
	private StatusType status;
	private static Random random;
	
	static {
		random = new Random();
	}
	
	public Order(int petId, int quantity, StatusType status) {
		this.orderId = random.nextInt(9000) + 1000;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}

	public Order(int orderId) {
		this.orderId = random.nextInt(9000) + 1000;
	}
	

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		Order o = null;
		if (obj instanceof Order)
			o = (Order) obj;
		return o.orderId == this.orderId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	
}
