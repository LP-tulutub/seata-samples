package com.lp.controller;

import com.lp.mapper.Table1Mapper;
import com.lp.pojo.Table1;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/table1")
public class Table1Controller {

    @Resource
    private Table1Mapper table1Mapper;

    @Transactional
    @RequestMapping("/ins")
    public int ins(@RequestBody Table1 table1){
        return this.table1Mapper.insert(table1);
    }

    @RequestMapping("/test")
    public Table1 test(){
        return this.table1Mapper.selectByPrimaryKey(1000);
    }

}
