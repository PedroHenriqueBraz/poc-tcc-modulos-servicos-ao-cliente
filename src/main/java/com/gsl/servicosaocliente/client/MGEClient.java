package com.gsl.servicosaocliente.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "MGE", url = "${servicos.mge.url}")
public interface MGEClient {
    @RequestMapping(method = RequestMethod.GET,  value = "/actuator/health")
    void health();
}
