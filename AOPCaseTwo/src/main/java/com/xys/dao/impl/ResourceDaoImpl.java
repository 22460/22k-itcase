package com.xys.dao.impl;

import com.xys.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {

    public boolean readRresources(String url, String password){
        // 模拟检验
        return password.equals("root");
    }
}
