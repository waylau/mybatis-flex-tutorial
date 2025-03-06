package com.waylau.mybatisflex.mybatisflexmultidatasource.model.hsqldb;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

@Table(value = "t_user", dataSource = "hsqldb-datasource")
public class User {

    @Id(keyType = KeyType.Auto)
    private Long id;

    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
