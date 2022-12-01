package com.inusun.springboot.common.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class NotifyController {



    @Autowired
    DataSourceTransactionManager dataSourceTransactionManager;
    @Autowired
    TransactionDefinition transactionDefinition;


    @PostMapping("/shouqianba/callback/")
    public String callBack(HttpServletRequest request) {
        log.info("回调接口接收到收钱吧请求, request: {}", request.getParameterMap().toString());
        log.info("回调接口接收到收钱吧请求, request: {}", request.getParameter("a"));

        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info(parameterMap.toString());
        //log.info(c.toString());
        //BufferedReader reader = request.getReader();

        log.info("热部署修改");
        // 响应成功
        return "success";
    }
}
