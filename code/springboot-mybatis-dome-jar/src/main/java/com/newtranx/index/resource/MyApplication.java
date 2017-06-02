package com.newtranx.index.resource;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/newtranxApi")
@Component
public class MyApplication extends ResourceConfig {
	/**
	 * 注册服务
	 */
	public MyApplication() {
		packages("com.newtranx.index");
	}
}
