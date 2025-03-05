package com.waylau.mybatisflex.mybatisflexh2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.mybatisflex.mybatisflexh2.mapper")
public class MybatisFlexH2Application {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexH2Application.class, args);
	}

}
