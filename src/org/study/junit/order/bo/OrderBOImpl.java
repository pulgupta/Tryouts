package org.study.junit.order.bo;

import java.sql.SQLException;

import org.study.junit.order.bo.exception.BOException;
import org.study.junit.order.dao.OrderDAO;
import org.study.junit.order.dto.Order;

public class OrderBOImpl implements OrderBO {

	OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if(result ==0)
				return false;	
		} 
		catch (SQLException e) {
			throw new BOException();
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		
		try {
			Order order = dao.read(id);
			order.setStatus("CANCLED");
			int result = dao.updata(order);
			if(result == 0)
				return false;
		} 
		catch (SQLException e) {
			throw new BOException();
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			Order order = dao.read(id);
			int result = dao.delete(order);
			if(result == 0)
				return false;
		} 
		catch (SQLException e) {
			throw new BOException();
		}
		return true;
	}

}
