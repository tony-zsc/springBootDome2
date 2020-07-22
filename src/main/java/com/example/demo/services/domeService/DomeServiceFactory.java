package com.example.demo.services.domeService;


import com.example.demo.services.domeService.iface.DomeService;
import com.example.demo.services.domeService.impl.OneDomeServiceImpl;
import com.example.demo.services.domeService.impl.TwoDomeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service("domeServiceFactory")
public class DomeServiceFactory {
    private static final Logger LOG = LoggerFactory.getLogger(DomeServiceFactory.class);

    @Autowired
    private  DomeService oneDomeService ;
    @Autowired
    private  DomeService twoDomeService ;

    public  DomeService getDomeservice(String  className){
        DomeService domeService = null ;
        if("OneDomeService".equalsIgnoreCase(className)){
            LOG.info(oneDomeService.doDomeService());
            domeService = oneDomeService;
        }else if("TwoDomeService".equalsIgnoreCase(className)) {
            LOG.info(twoDomeService.doDomeService());
            domeService = twoDomeService;
        }
        return domeService ;
    }
}
