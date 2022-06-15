package com.zjz;

import com.zjz.factory.PaymentFactory;
import com.zjz.inter.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestFile
 * @Author Junzhou Zhang
 * @Create 2022/6/15 10:28
 */
public class TestFile {

    @Test
    public void getPaymentServiceTest(){
        PaymentService ali_pay = PaymentFactory.getPaymentService("ali_pay");
        ali_pay.pay();

        PaymentService wechat_pay = PaymentFactory.getPaymentService("wechat_pay");
        wechat_pay.pay();
    }
}
