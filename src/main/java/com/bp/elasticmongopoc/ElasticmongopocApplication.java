package com.bp.elasticmongopoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;

@SpringBootApplication
public class ElasticmongopocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticmongopocApplication.class, args);
	}
	
	@Bean
    public HystrixCommandAspect hystrixAspect() {
        return new HystrixCommandAspect();
    }

}
