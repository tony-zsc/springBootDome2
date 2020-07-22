package com.example.demo.controller;


import com.example.demo.services.domeService.DomeServiceFactory;
import com.example.demo.services.domeService.iface.DomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dome")
public class DemoController {

    private DomeService domeService;
    private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private DomeServiceFactory domeServiceFactory ;

    @RequestMapping("/get")
    public String getDome(){
        domeService = domeServiceFactory.getDomeservice("oneDomeService");
        String resStr = domeService.doDomeService();






        LOG.info(resStr);
        return resStr;
}














}
