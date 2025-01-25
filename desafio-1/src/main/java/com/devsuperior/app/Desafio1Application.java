package com.devsuperior.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.app.entities.Order;
import com.devsuperior.app.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.0, 20.0);
				
		System.out.println(orderService.total(order));
		
	}

}
