package com.zjz.impl;

import com.zjz.inter.PaymentService;

/**
 * @ClassName AliPaySercice
 * @Author Junzhou Zhang
 * @Create 2022/6/15 10:14
 */
public class AliPaySercice implements PaymentService {
    @Override
    public void pay() {
        System.out.println("阿里支付对象...");
    }
}
