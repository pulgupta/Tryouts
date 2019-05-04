package org.study.patterns.state;

public interface OrderState {
	
	public boolean nextState(Order o);
	public boolean previousState(Order o);
	public boolean updateOrder(Order o, Order updatedOrder);

}
