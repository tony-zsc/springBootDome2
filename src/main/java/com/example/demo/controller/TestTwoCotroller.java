package com.example.demo.controller;

import com.example.demo.services.domeService.iface.DomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/two")
@RestController
public class TestTwoCotroller {
    @Autowired
    private DomeService oneDomeService ;

    private static final Logger LOG = LoggerFactory.getLogger(TestTwoCotroller.class);
    @RequestMapping("/test")
    public String getTestTwo(){
        String res = oneDomeService.doDomeService();
        LOG.info(res);






        return res ;
    }




}
