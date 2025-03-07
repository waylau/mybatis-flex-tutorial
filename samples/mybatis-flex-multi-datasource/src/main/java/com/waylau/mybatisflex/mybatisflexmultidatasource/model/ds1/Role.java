package com.waylau.mybatisflex.mybatisflexmultidatasource.model.ds1;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

@Table(value = "t_role", dataSource = "ds1-datasource")
public class Role {

    @Id(keyType = KeyType.Auto)
    private Long id;

    private String roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
