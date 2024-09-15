package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") // 默认singleton
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;
    public String find(){
        return alphaDao.select();
    }

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialize the AlphaService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy the AlphaService");
    }

}
