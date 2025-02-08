package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Actor;


/**
* Actor表ExtService接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.083
*/
public interface IActorExtService
{
    /**
    * Actor表自定义查询
    *
    * @return Actor表集合
    */
    public List<Actor> customMethod();


}

