package com.newtranx.index.main;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({ "com.newtranx.util.spring", "com.newtranx.index" })
@Configuration
public class Main extends SpringBootServletInitializer {
	public static void main(String[] args) {
		new Main().configure(new SpringApplicationBuilder(Main.class)).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Main.class);
	}
}
