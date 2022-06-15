package com.zjz.factory;

import com.zjz.impl.AliPaySercice;
import com.zjz.impl.WeChatService;
import com.zjz.inter.PaymentService;

/**
 * @ClassName PaymentFactory
 * @Author Junzhou Zhang
 * @Create 2022/6/15 10:15
 */
public class PaymentFactory {
    public static PaymentService getPaymentService(String payType) {
        PaymentService paymentService = null;
        switch (payType) {
            case "ali_pay":
                paymentService = new AliPaySercice();
                break;
            case "wechat_pay":
                paymentService = new WeChatService();
                break;
        }
        return paymentService;
    }

}
