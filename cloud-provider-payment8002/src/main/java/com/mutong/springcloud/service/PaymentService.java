package com.mutong.springcloud.service;

import com.mutong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 22:03
 * @time_complexity: O()
 */
@Service
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
