package com.waylau.mybatisflex.mybatisflexhsqldb;

import com.mybatisflex.core.query.QueryWrapper;
import com.waylau.mybatisflex.mybatisflexhsqldb.mapper.CountryMapper;
import com.waylau.mybatisflex.mybatisflexhsqldb.mapper.UserMapper;
import com.waylau.mybatisflex.mybatisflexhsqldb.model.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.waylau.mybatisflex.mybatisflexhsqldb.model.table.UserTableDef.USER;
import static com.waylau.mybatisflex.mybatisflexhsqldb.model.table.CountryTableDef.COUNTRY;

@SpringBootTest
class MybatisFlexHSQLDBApplicationTests {

    private static Logger log = LoggerFactory.getLogger(MybatisFlexHSQLDBApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CountryMapper countryMapper;

    @Test
    void queryWrapper() {
        // 查询名字中带“卫”的用户列表
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .from(USER)
                .where(USER.USER_NAME.like("卫"));

        List<User> userList = userMapper.selectListByQuery(queryWrapper);

        userList.forEach(user -> log.info("user id {}, {}", user.getId(), user.getUserName()));
    }

    @Test
    void queryWrapper2() {
        // 查询名字中带“卫”的用户列表
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .from(COUNTRY)
                .where(COUNTRY.NAME.like("卫"));

        List<User> userList = userMapper.selectListByQuery(queryWrapper);

        userList.forEach(user -> log.info("user id {}, {}", user.getId(), user.getUserName()));
    }
}
