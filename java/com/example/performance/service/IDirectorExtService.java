package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Director;


/**
* Director表ExtService接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.112
*/
public interface IDirectorExtService
{
    /**
    * Director表自定义查询
    *
    * @return Director表集合
    */
    public List<Director> customMethod();


}

