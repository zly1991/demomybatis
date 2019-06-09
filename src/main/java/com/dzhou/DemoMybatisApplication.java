package com.dzhou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan("com.dzhou.controller")
@MapperScan({"com.dzhou.mapper","com.dzhou.dao"})
public class DemoMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisApplication.class, args);
	}

}
