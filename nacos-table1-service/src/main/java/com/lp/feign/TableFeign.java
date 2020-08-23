package com.lp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "nacos-table2-service")
public interface TableFeign {

    @PostMapping("/table2/test02")
    Object tes02();
}
