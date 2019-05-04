package org.study.patterns.state;

public class Order {

	String orderId;
	String productId;
	String userId;
	int quantity;
	OrderState orderState;
	
	public Order() {
		// To start we will start with order created 
		orderId = Double.toString(Math.random()); // Very crap way of doing this but for now we can move ahead with this
		orderState = new OrderCreated();
	}
	
	// On to one mapping between the context and the state methods
	public boolean next() {
		return orderState.nextState(this);
	}
	
	public boolean previous() {
		return orderState.previousState(this);
	}
	
	public boolean updateOrder(Order o) {
		return orderState.updateOrder(this, o);
	}
	
	// Getters and setters
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}
	
}
