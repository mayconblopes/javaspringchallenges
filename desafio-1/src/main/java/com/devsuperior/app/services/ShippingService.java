package com.devsuperior.app.services;

import org.springframework.stereotype.Service;

import com.devsuperior.app.entities.Order;

@Service
public class ShippingService {

	public ShippingService() {
	}

	public double shipment(Order order) {
		if (order.getBasic() < 100.0)
			return 20.0;
		if (order.getBasic() >= 100.0 && order.getBasic() < 200.0)
			return 12.0;
		else
			return 0.0;
	}

}
