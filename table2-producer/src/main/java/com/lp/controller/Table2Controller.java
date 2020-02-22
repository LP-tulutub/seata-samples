package com.lp.controller;

import com.lp.mapper.Table2Mapper;
import com.lp.pojo.Table2;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/table2")
public class Table2Controller {

    @Resource
    private Table2Mapper table2Mapper;

    @Transactional
    @RequestMapping("/ins")
    public int ins(@RequestBody Table2 table2){
        return this.table2Mapper.insert(table2);
    }

    @RequestMapping("/test")
    public Table2 test(){
        return this.table2Mapper.selectByPrimaryKey(1000);
    }

}
