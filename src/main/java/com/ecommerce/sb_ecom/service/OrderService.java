package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payload.OrderDTO;

public interface OrderService {
    public OrderDTO placeOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage);
}
