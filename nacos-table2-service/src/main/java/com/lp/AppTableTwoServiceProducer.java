package com.lp;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lp.mapper")
public class AppTableTwoServiceProducer {
	public static void main(String[] args) {
		SpringApplication.run(AppTableTwoServiceProducer.class, args);
	}
}
