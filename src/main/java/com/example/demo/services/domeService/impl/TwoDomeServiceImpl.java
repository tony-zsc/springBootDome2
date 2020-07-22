package com.example.demo.services.domeService.impl;

import com.example.demo.services.domeService.iface.DomeService;
import org.springframework.stereotype.Service;

@Service("twoDomeService")
public class TwoDomeServiceImpl implements DomeService {
    @Override
    public String doDomeService() {
        return "其中一个实现类：TwoDomeServiceImpl，执行了。";
    }
}
