package com.lp.controller;


import com.lp.entity.Table2;
import com.lp.mapper.Table2Mapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author root
 * @since 2020-08-23
 */
@RestController
@RequestMapping("//table2")
public class Table2Controller {

    @Resource
    private Table2Mapper table2Mapper;

    @GetMapping("/test01")
    public Object test01(){
        return this.table2Mapper.selectById(1000);
    }

    @PostMapping("/test02")
    public Object tes02(){
        Table2 table2 = new Table2();
        table2.setId(123456);
        table2.setName("test02");
        table2.setContent("内容");
        return this.table2Mapper.insert(table2);
    }


}
