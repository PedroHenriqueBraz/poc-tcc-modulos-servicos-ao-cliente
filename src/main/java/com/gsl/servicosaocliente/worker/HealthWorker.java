package com.gsl.servicosaocliente.worker;

import com.gsl.servicosaocliente.client.MGEClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class HealthWorker {
    @Autowired
    private MGEClient mgeClient;

    @Scheduled(fixedRate = 300000)
    public void healthCheck(){
        System.out.println("mge ping");
        mgeClient.health();
    }
}
