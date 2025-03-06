package com.waylau.mybatisflex.mybatisflexhsqldb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.mybatisflex.mybatisflexhsqldb.mapper")
public class MybatisFlexHSQLDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexHSQLDBApplication.class, args);
	}

}
