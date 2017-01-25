package com.timy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.timy.boot.listener.MyAppListener;

@SpringBootApplication // 等同于 @Configuration @EnableAutoConfiguration @ComponentScanpubli
public class ContainerStart {

	public static void main(String[] args) {
		System.out.println("Container ready start.....");
		SpringApplication app = new SpringApplication(ContainerStart.class);
		app.addListeners(new MyAppListener());
		app.run(args);
		System.out.println("Container has started success.....");
	}

}
