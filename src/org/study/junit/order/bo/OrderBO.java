package org.study.junit.order.bo;

import org.study.junit.order.bo.exception.BOException;
import org.study.junit.order.dto.Order;

public interface OrderBO {
	
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
	
}
