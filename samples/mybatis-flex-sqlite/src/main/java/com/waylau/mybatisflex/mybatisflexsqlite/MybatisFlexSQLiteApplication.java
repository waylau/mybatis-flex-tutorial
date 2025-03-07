package com.waylau.mybatisflex.mybatisflexsqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.waylau.mybatisflex.mybatisflexsqlite.mapper")
public class MybatisFlexSQLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisFlexSQLiteApplication.class, args);
	}

}
