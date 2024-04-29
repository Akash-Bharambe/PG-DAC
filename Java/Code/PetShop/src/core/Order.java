package core;

/**
 * It represents an order placed for a pet
 */
public class Order {

	private int orderId; // Unique order ID for a specific order
	private int petId; // Pet ID of the pet ordered
	private int quantity; // Quantity of pets ordered
	private StatusType status; // Status of Order.

	/**
	 * Parameterized Constructor to initializee Order instance.
	 * 
	 * @param orderId  The order ID of this particular order.
	 * @param petId    The pet ID og the pet to be ordered.
	 * @param quantity The quantity of pets to be ordered.
	 */
	public Order(int orderId, int petId, int quantity) {
		this.orderId = orderId;
		this.petId = petId;
		this.quantity = quantity;
		this.status = StatusType.PLACED;
	}

	/**
	 * Gets the Order ID of the Order
	 * 
	 * @return orderID of this order
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * Gets the Pet ID of the ordered pet.
	 * 
	 * @return Pet Id of the ordered pet
	 */
	public int getPetId() {
		return petId;
	}

	/**
	 * Gets the Status of the order
	 * 
	 * @return status of the order
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * Sets the status of the order
	 * 
	 * @param status The new status of the order
	 */
	public void setStatus(StatusType status) {
		this.status = status;
	}

	/**
	 * Overriden method of Object class to check if 2 orders are equal.
	 * 
	 * @return If the provided order id is equal to current order's order id.
	 */
	@Override
	public boolean equals(Object obj) {
		Order o = null;
		if (obj instanceof Order)
			o = (Order) obj;
		return o.orderId == this.orderId;
	}

	/**
	 * Overriden method of Object class to get String representation of an order.
	 * 
	 * @return The string representation of the Order.
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}

}
