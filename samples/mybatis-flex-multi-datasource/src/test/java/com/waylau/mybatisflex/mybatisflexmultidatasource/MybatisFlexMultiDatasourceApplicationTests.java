package com.waylau.mybatisflex.mybatisflexmultidatasource;


import com.mybatisflex.core.query.QueryWrapper;
import com.waylau.mybatisflex.mybatisflexmultidatasource.mapper.ds1.RoleMapper;
import com.waylau.mybatisflex.mybatisflexmultidatasource.mapper.ds2.UserMapper;
import com.waylau.mybatisflex.mybatisflexmultidatasource.model.ds1.Role;
import com.waylau.mybatisflex.mybatisflexmultidatasource.model.hsqldb.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static com.waylau.mybatisflex.mybatisflexmultidatasource.model.ds1.table.RoleTableDef.ROLE;
import static com.waylau.mybatisflex.mybatisflexmultidatasource.model.hsqldb.table.UserTableDef.USER;

@SpringBootTest
class MybatisFlexMultiDatasourceApplicationTests {

    private static Logger log = LoggerFactory.getLogger(MybatisFlexMultiDatasourceApplicationTests.class);

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // 查询角色中带“师”的角色列表
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where(ROLE.ROLE_NAME.like("师"));

        List<Role> roleList = roleMapper.selectListByQuery(queryWrapper);

        roleList.forEach(role -> log.info("role id {}, {}", role.getId(), role.getRoleName()));
    }

    @Test
    void contextLoads2() {
        // 查询名字中带“卫”的用户列表
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where(USER.USER_NAME.like("卫"));

        List<User> userList = userMapper.selectListByQuery(queryWrapper);

        userList.forEach(user -> log.info("user id {}, {}", user.getId(), user.getUserName()));
    }

}
