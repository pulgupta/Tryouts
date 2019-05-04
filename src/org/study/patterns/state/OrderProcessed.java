package org.study.patterns.state;

public class OrderProcessed implements OrderState {

	@Override
	public boolean nextState(Order o) {
		// not possible to move forward
		return false;
	}

	@Override
	public boolean previousState(Order o) {
		// Not possible to move back from processed state
		return false;
	}

	@Override
	public boolean updateOrder(Order o, Order updatedOrder) {
		// TODO not possible to update order once it is processed
		return false;
	}

}
