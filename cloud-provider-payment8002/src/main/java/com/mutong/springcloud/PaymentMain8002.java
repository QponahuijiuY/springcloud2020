package com.mutong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-29 23:34
 * @time_complexity: O()
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
