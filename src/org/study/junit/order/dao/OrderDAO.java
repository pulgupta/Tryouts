package org.study.junit.order.dao;

import java.sql.SQLException;

import org.study.junit.order.dto.Order;

public interface OrderDAO {
	int create(Order order) throws SQLException;
	Order read(int id) throws SQLException;
	int updata(Order order) throws SQLException;
	int delete(Order order) throws SQLException;
}
