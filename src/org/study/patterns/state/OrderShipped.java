package org.study.patterns.state;

public class OrderShipped implements OrderState {

	@Override
	public boolean nextState(Order o) {
		o.setOrderState(new OrderProcessed());
		return true;
	}

	@Override
	public boolean previousState(Order o) {
		o.setOrderState(new OrderCreated());
		return true;
	}

	@Override
	public boolean updateOrder(Order o, Order updatedOrder) {
		// Not possible to update order once it is shipped
		return false;
	}

}
