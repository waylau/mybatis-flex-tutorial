package com.waylau.mybatisflex.mybatisflederby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.mybatisflex.mybatisflederby.mapper")
public class MybatisFlexDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexDerbyApplication.class, args);
	}

}
