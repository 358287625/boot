package com.timy.boot.container;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
//@Component 
public class MyCustomization implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setContextPath("/boot");  
//        container.setPort(8081);  
//        container.setSessionTimeout(30);  
        container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/screen/error"));
//        configurableEmbeddedServletContainer.setContextPath("/test"); //2
	}

}
