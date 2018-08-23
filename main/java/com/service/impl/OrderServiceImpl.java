package com.service.impl;

import com.model.Order;
import com.service.OrderService;
import org.springframework.stereotype.Service;

@Service("OrderService")
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
}
