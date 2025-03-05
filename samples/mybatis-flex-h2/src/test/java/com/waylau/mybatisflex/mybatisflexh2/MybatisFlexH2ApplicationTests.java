package com.waylau.mybatisflex.mybatisflexh2;

import com.mybatisflex.core.query.QueryWrapper;
import com.waylau.mybatisflex.mybatisflexh2.mapper.RoleMapper;
import com.waylau.mybatisflex.mybatisflexh2.model.Role;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.waylau.mybatisflex.mybatisflexh2.model.table.RoleTableDef.ROLE;

@SpringBootTest
class MybatisFlexH2ApplicationTests {

    private static Logger log = LoggerFactory.getLogger(MybatisFlexH2ApplicationTests.class);

    @Autowired
    private RoleMapper roleMapper;

    @Test
    void contextLoads() {
		// 查询角色中带“师”的角色列表
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where(ROLE.ROLE_NAME.like("师"));

        List<Role> roleList = roleMapper.selectListByQuery(queryWrapper);

        roleList.forEach(role -> log.info("role id {}, {}", role.getId(), role.getRoleName()));
        System.out.println(roleList);
    }
}
