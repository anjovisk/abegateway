package com.imarques.abegateway.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
@EnableAutoConfiguration
public class ApiDocumentationController implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
		resources.add(toResource("abelibrary", "/abelibrary/v2/api-docs", "1.0"));
		resources.add(toResource("abecreditcard", "/abecreditcard/v2/api-docs", "1.0"));
		resources.add(toResource("abeaudit", "/abeaudit/v2/api-docs", "1.0"));
		resources.add(toResource("amazon-authy", "/amazon-authy/v1/public/v2/api-docs", "1.0"));
		
		return resources;
	}
	
	private SwaggerResource toResource(String name, String location, String version) {
        SwaggerResource resource = new SwaggerResource();
        resource.setName(name);
        resource.setLocation(location);
        resource.setSwaggerVersion(version);
        
        return resource;
    }
}
