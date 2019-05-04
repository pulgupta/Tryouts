package org.study.patterns.state;

public class OrderCreated implements OrderState {

	@Override
	public boolean nextState(Order o) {
		o.setOrderState(new OrderShipped());
		return false;
	}

	@Override
	public boolean previousState(Order o) {
		// Not possible to move back from created state so return false
		return false;
	}

	@Override
	public boolean updateOrder(Order o, Order updatedOrder) {
		// update is possible in this state so update
		o.setQuantity(updatedOrder.getQuantity());
		return false;
	}

}
