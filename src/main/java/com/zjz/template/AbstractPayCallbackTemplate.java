package com.zjz.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.Map;

/**
 * @ClassName AbstractPayCallbackTemplate
 * @Author Junzhou Zhang
 * @Create 2022/6/15 11:20
 */
@Slf4j
public abstract class AbstractPayCallbackTemplate {
    /**
     * 定义共同行为的骨架
     * @return
     */
    public String asyncCallBack(){
        //1、验证参数和验证签名
        Map<String, String> verifySignatureMap = verifySignature();
        //2、日志收集;非抽象方法
        payLog(verifySignatureMap);

        String analysisCode = verifySignatureMap.get("analysisCode");

        if(!analysisCode.equals("200")){
            return resultFail();
        }

        //3、更改数据库状态 返回不同的支付结果
        return asyncService(verifySignatureMap);
    }

    /**
     * 支付回调验证参数
     *
     * @return
     */
    protected abstract Map<String, String> verifySignature();

    /**
     * 使用多线程异步写入日志
     *
     * @param verifySignatureMap
     */
    @Async
    public void payLog(Map<String, String> verifySignatureMap) {
        log.info("写入数据库......verifySignatureMap:{}", verifySignatureMap);
    }

    /**
     * 每个子类需要实现 实现业务解析操作
     *
     * @return
     */
    protected abstract String asyncService(Map<String, String> verifySignatureMap);

    /**
     * 异步返回结果..
     *
     * @return
     */
    protected abstract String resultSuccess();

    /**
     * 异步返回失败
     *
     * @return
     */
    protected abstract String resultFail();

}
