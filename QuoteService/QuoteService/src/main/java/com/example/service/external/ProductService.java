package com.example.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aiqbal on 9/18/2017.
 */
@Service
public class ProductService {

    @Autowired
    //@LoadBalanced
    protected RestTemplate restTemplate;

    protected String serviceUrl;

    //@Autowired
    public ProductService( @Value("${productService.url}") String serviceUrl ) {
        System.out.println("serviceUrl:" + serviceUrl);
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
    }

    public Map getProductMetadata(String productCode ) {
        System.out.println("getProductMetadata: serviceUrl: " + serviceUrl);
        System.out.println("getProductMetadata: serviceUrl: " + serviceUrl);
        return restTemplate.getForObject(serviceUrl+ "/" + productCode, Map.class);
    }
}
