package com.dao.impl;

import com.dao.OrderDao;
import com.model.Order;
import org.springframework.stereotype.Repository;

@Repository("OrderDao")
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {

}
