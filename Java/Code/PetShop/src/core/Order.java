package core;

public class Order {
	
	private int orderId;
	private int petId;
	private int quantity;
	private StatusType status;
	
	
	public Order(int orderId, int petId, int quantity) {
		this.orderId = orderId;
		this.petId = petId;
		this.quantity = quantity;
		this.status = StatusType.PLACED;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public int getPetId() {
		return petId;
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
