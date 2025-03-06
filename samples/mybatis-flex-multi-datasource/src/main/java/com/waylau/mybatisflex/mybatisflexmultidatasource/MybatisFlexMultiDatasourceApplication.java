package com.waylau.mybatisflex.mybatisflexmultidatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.mybatisflex.mybatisflexmultidatasource.mapper")
public class MybatisFlexMultiDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexMultiDatasourceApplication.class, args);
	}

}
