package com.payment.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.demo.entity.Order;
import com.payment.demo.service.OrderService;

@RestController
@RequestMapping("/order-details")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/save")
	public ResponseEntity<?> saveOrder(@RequestBody() Order order) {
		Order dborder = orderService.saveOrder(order);
		return ResponseEntity.ok().body(dborder);
	}

	@GetMapping("/order/{id}")
	public Order getData(@PathVariable("id") Long id) {
		return orderService.getOrder(id);
	}

	@PutMapping("/orderupdate")
	public Order updatedata(@RequestBody() Order order) {
		
		return orderService.updateOrder(order);
	}

	@DeleteMapping("/order/{id}")
	public String deletedate(@PathVariable("id") Long id) {
		Order data = orderService.getOrder(id);
		
			Boolean test=orderService.deleteOrder(id);
         
		return (data!=null)?(test)?"deleted sucess":"no id found":"no data found";
		

	}
	

}
