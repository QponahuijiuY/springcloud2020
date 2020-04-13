package com.mutong.springcloud.dao;

import com.mutong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 21:49
 * @time_complexity: O()
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
