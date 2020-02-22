package com.lp.feign.fallback;

import com.lp.feign.Table1Feign;
import com.lp.pojo.Table1;
import org.springframework.stereotype.Component;


@Component
public class Table1FeignFallback implements Table1Feign {
    @Override
    public int ins(Table1 table1) {
        return 0;
    }
}
