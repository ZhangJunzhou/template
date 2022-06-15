package com.zjz.impl;

import com.zjz.inter.PaymentService;

/**
 * @ClassName WeChatService
 * @Author Junzhou Zhang
 * @Create 2022/6/15 10:15
 */
public class WeChatService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("微信支付对象...");
    }
}
