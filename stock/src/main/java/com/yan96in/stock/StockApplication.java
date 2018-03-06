package com.yan96in.stock;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StockApplication.class, args);
		SpringApplicationBuilder builder=new SpringApplicationBuilder(StockApplication.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}
	
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello Spring Boot!";
    }
}
