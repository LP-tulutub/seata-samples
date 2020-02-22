package com.lp.feign.fallback;

import com.lp.feign.Table2Feign;
import com.lp.pojo.Table2;
import org.springframework.stereotype.Component;

@Component
public class Table2FeignFallback implements Table2Feign {
    @Override
    public int ins(Table2 table2) {
        return 0;
    }
}
