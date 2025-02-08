package com.example.performance.service.impl;

import com.example.performance.domain.Boss;
import com.example.performance.mapper.BossExtMapper;
import com.example.performance.service.IBossExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Boss表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.097
*/
public class BossExtServiceImpl implements IBossExtService
{
    @Inject
    private BossExtMapper bossExtMapper;


    /**
    * Boss表自定义查询
    *
    * @return Boss表结果集
    */
    @Override
    public List<Boss> customMethod() {
        return bossExtMapper.customMethod();
    }


}

