package com.timy.boot.listener;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationListener;

public class MyAppListener implements
		ApplicationListener<ApplicationStartedEvent> {
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("ApplicationStartedEvent=-------------" + event);
	}

	public void onApplicationEvent(ApplicationFailedEvent event) {
		System.out.println("ApplicationFailedEvent=-------------" + event);
	}

	public void onApplicationEvent(ApplicationPreparedEvent event) {
		System.out.println("ApplicationPreparedEvent=-------------" + event);
	}

	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("ApplicationEnvironmentPreparedEvent=-------------"
				+ event);
	}

}
