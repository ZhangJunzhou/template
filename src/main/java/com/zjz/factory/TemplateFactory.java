package com.zjz.factory;

import com.zjz.SpringUtils;
import com.zjz.template.AbstractPayCallbackTemplate;

/**
 * @ClassName TemplateFactory
 * @Author Junzhou Zhang
 * @Create 2022/6/15 11:45
 */
public class TemplateFactory {
    public static String getPayCallbackTemplate(String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = (AbstractPayCallbackTemplate) SpringUtils.getBean(templateId);
        String resultCode = payCallbackTemplate.asyncCallBack();
        return resultCode;
    }
}
