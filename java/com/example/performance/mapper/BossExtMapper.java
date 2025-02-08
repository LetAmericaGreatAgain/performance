package com.example.performance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Boss;


/**
* Boss表ExtMapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.097
*/
public interface BossExtMapper
{
    /**
    * Boss表自定义查询方法
    *
    * @return Boss表集合
    */
    public List<Boss> customMethod();
}

