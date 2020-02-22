package com.lp.feign;

import com.lp.pojo.Table1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "table1-producer")
public interface Table1Feign {

    @RequestMapping("/table1/ins")
    int ins(@RequestBody Table1 table1);


}
