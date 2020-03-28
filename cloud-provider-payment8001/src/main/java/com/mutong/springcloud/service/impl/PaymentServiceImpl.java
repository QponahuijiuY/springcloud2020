package com.mutong.springcloud.service.impl;

import com.mutong.springcloud.dao.PaymentDao;
import com.mutong.springcloud.entity.Payment;
import com.mutong.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 22:04
 * @time_complexity: O()
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
