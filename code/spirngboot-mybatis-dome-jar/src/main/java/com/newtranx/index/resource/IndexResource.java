package com.newtranx.index.resource;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.newtranx.index.service.TestService;

@Path("/index")
@Component
public class IndexResource {

	@Resource
	public TestService testService;

	@GET
	@Path("/")
	public String index() {
		return "hello world!";
	}

	@GET
	@Path("/inseter")
	public String inseter() {
		System.out.println(123);
		testService.insert();
		return "132";

	}
}
