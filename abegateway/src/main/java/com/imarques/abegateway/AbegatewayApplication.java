package com.imarques.abegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.imarques.abegateway.filters.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class AbegatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbegatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
