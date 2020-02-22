package com.lp.controller;

import com.lp.feign.Table1Feign;
import com.lp.feign.Table2Feign;
import com.lp.pojo.Table1;
import com.lp.pojo.Table2;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/table")
public class TableController {

    @Resource
    private Table1Feign table1Feign;
    @Resource
    private Table2Feign table2Feign;

    /**
     * 没有分布式事务回滚，table1插入成功，table2没有插入
     * @return
     */
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        //table1正常
        Table1 table1 = new Table1();
        table1.setId(1);
        table1.setName("1");
        table1.setContext("1");
        this.table1Feign.ins(table1);
        //table2无法插入
        Table2 table2 = new Table2();
        table2.setId(1);
        table2.setName("1");
        this.table2Feign.ins(table2);
        return "over";
    }

    /**
     * seata分布式事务，2个表都没有插入
     * @return
     */
    @GlobalTransactional(name = "mybatis_tx_NO1",rollbackFor = Exception.class)
    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        //table1正常
        Table1 table1 = new Table1();
        table1.setId(2);
        table1.setName("2");
        table1.setContext("2");
        this.table1Feign.ins(table1);
        //table2无法插入
        Table2 table2 = new Table2();
        table2.setId(2);
        table2.setName("2");
        this.table2Feign.ins(table2);
        return "over2";
    }

}
