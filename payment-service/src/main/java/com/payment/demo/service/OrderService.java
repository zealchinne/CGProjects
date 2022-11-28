package com.payment.demo.service;

import com.payment.demo.entity.Order;

public interface OrderService {
	
	Order saveOrder(Order order);
	Order updateOrder(Order order);
	Order getOrder(Long orderId);
	Boolean deleteOrder(Long orderId);

}
