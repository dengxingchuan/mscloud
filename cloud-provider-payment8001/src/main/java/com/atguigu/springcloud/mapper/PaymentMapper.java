package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.domain.Payment;

public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
