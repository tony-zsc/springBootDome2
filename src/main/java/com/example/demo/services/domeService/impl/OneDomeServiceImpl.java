package com.example.demo.services.domeService.impl;

import com.example.demo.services.domeService.iface.DomeService;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service("oneDomeService")
public class OneDomeServiceImpl implements DomeService {

    private static String auther ;

    public OneDomeServiceImpl (){
        auther = UUID.randomUUID().toString();
    }

    @Override
    public String doDomeService(){
        return "其中一个实现类：OneDomeServiceImpl，执行了。"+"Auther:"+auther;
    }
}
