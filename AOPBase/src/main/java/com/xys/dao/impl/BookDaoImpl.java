package com.xys.dao.impl;

import com.xys.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void update() {
        System.out.println("book dao update is running...");
    }

    public int select(){
        System.out.println("book dao select is running...");
        return 100;
    }
}
