package com.example.performance.service.impl;

import com.example.performance.domain.Actor;
import com.example.performance.mapper.ActorExtMapper;
import com.example.performance.service.IActorExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Actor表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.083
*/
public class ActorExtServiceImpl implements IActorExtService
{
    @Inject
    private ActorExtMapper actorExtMapper;


    /**
    * Actor表自定义查询
    *
    * @return Actor表结果集
    */
    @Override
    public List<Actor> customMethod() {
        return actorExtMapper.customMethod();
    }


}

