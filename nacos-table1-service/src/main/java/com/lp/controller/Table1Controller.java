package com.lp.controller;


import com.lp.entity.Table1;
import com.lp.feign.TableFeign;
import com.lp.mapper.Table1Mapper;
import io.seata.spring.annotation.GlobalTransactional;
import javafx.scene.control.TableFocusModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author root
 * @since 2020-08-23
 */
@Controller
@RequestMapping("//table1")
public class Table1Controller {

    @Resource
    private Table1Mapper table1Mapper;
    @Resource
    private TableFeign tableFeign;

    @GetMapping("/test01")
    @ResponseBody
    public Object test01(){
        return this.table1Mapper.selectById(1000);
    }

    @GlobalTransactional
    @GetMapping("/test02")
    @ResponseBody
    public Object test02(){
        Table1 table1 = new Table1();
        table1.setId(123456);
        table1.setName("test02");
        table1.setContext("内容");
        int val1 = this.table1Mapper.insert(table1);
        int val2 = (int) this.tableFeign.tes02();
        if (true) throw new RuntimeException("GlobalTransactional 测试");
        return val1 + val2;
    }



}
