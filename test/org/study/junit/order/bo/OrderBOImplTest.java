package org.study.junit.order.bo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.study.junit.order.bo.exception.BOException;
import org.study.junit.order.dao.OrderDAO;
import org.study.junit.order.dto.Order;

import static org.mockito.Mockito.*;

import java.sql.SQLException;

public class OrderBOImplTest {

	@Mock
	OrderDAO dao;
	
	@Before
	public void setup() {
		//This will scan the object passed in the method call.
		//All the members marked as @Mock will be mocked out.
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void placeOrder_shouldCreateAnOrder() throws SQLException, BOException {
		
		OrderBOImpl bo = new OrderBOImpl();
		bo.setDao(dao);
		Order order = new Order();
		//This will check if in case we are calling the create method on the DAO 
		//In that case we will then be calling the below and will return the integer as mentioned below.
		when(dao.create(order)).thenReturn(new Integer(1));
		boolean result = bo.placeOrder(order);
		assertTrue(result);
		
		//This will check if the mocked object is actually called only and only once.
		verify(dao).create(order);
	}

}
