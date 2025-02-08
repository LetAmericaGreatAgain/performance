package com.example.performance.service.impl;

import com.example.performance.domain.Movie;
import com.example.performance.mapper.MovieExtMapper;
import com.example.performance.service.IMovieExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Movie表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.114
*/
public class MovieExtServiceImpl implements IMovieExtService
{
    @Inject
    private MovieExtMapper movieExtMapper;


    /**
    * Movie表自定义查询
    *
    * @return Movie表结果集
    */
    @Override
    public List<Movie> customMethod() {
        return movieExtMapper.customMethod();
    }


}

