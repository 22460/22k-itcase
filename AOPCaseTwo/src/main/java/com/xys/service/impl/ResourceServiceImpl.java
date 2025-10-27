package com.xys.service.impl;

import com.xys.dao.ResourceDao;
import com.xys.service.ResourceService;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceDao resourceDao;

    public boolean openURL(String url, String password){
        return resourceDao.readRresources(url, password);
    }
}
