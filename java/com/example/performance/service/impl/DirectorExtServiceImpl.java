package com.example.performance.service.impl;

import com.example.performance.domain.Director;
import com.example.performance.mapper.DirectorExtMapper;
import com.example.performance.service.IDirectorExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Director表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.112
*/
public class DirectorExtServiceImpl implements IDirectorExtService
{
    @Inject
    private DirectorExtMapper directorExtMapper;


    /**
    * Director表自定义查询
    *
    * @return Director表结果集
    */
    @Override
    public List<Director> customMethod() {
        return directorExtMapper.customMethod();
    }


}

