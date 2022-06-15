package com.zjz.controller;

import com.zjz.factory.TemplateFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TemplateController
 * @Author Junzhou Zhang
 * @Create 2022/6/15 11:50
 */
@RestController
public class TemplateController {

    @RequestMapping("/asynCallback")
    public String asynCallback(String templateId){
        String payCallbackTemplate = TemplateFactory.getPayCallbackTemplate(templateId);
        return payCallbackTemplate;
    }
}
