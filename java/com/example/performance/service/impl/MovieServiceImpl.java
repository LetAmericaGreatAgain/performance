package com.example.performance.service.impl;

import com.example.performance.common.util.DateTimeUtil;
import com.example.performance.domain.Movie;
import com.example.performance.mapper.MovieMapper;
import com.example.performance.service.IMovieService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Movie表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.114
*/
public class MovieServiceImpl implements IMovieService
{
    @Inject
    private MovieMapper movieMapper;

    /**
    * Movie表根据主键单条查询
    *
    * @param title Movie表主键
    * @param year Movie表主键
    * @param genre Movie表主键
    * @return Movie表
    */
    @Override
    public Movie selectMovieByTitleAndYearAndGenre(String title, Integer year, String genre) {
        return movieMapper.selectMovieByTitleAndYearAndGenre(title, year, genre);
    }

    /**
    * Movie表固定列组合条件查询
    *
    * @param movie Movie表查询条件
    * @return Movie表结果集
    */
    @Override
    public List<Movie> selectMovieList(Movie movie) {
        return movieMapper.selectMovieList(movie);
    }

    /**
    * Movie表固定列组合in查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    @Override
    public List<Movie> movieFixedColumnInQuery(List<Movie> movieList) {
        return movieMapper.movieFixedColumnInQuery(movieList);
    }

    /**
    * Movie表多样列组合or查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    @Override
    public List<Movie> movieMultiColumnOrQuery(List<Movie> movieList) {
        return movieMapper.movieMultiColumnOrQuery(movieList);
    }

    /**
    * Movie表多样列组合in查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    @Override
    public List<Movie> movieMultiColumnInQuery(List<Movie> movieList) {
        return movieMapper.movieMultiColumnInQuery(movieList);
    }

    /**
    * Movie表多样列组合union查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    @Override
    public List<Movie> movieMultiColumnUnionQuery(List<Movie> movieList) {
        return movieMapper.movieMultiColumnUnionQuery(movieList);
    }

    /**
    * Movie表多样列组合union all查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    @Override
    public List<Movie> movieMultiColumnUnionAllQuery(List<Movie> movieList) {
        return movieMapper.movieMultiColumnUnionAllQuery(movieList);
    }

    /**
    * Movie表单条插入
    *
    * @param movie Movie表对应实体
    * @return 影响行数
    */
    @Override
    public int insertMovie(Movie movie) {
        movie.setCreateTime(DateTimeUtil.currentDateTime());
        return movieMapper.insertMovie(movie);
    }

    /**
    * Movie表批量插入
    *
    * @param movieList Movie表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertMovie(List<Movie> movieList) {
        return movieMapper.batchInsertMovie(movieList);
    }

    /**
    * Movie表根据主键修改单行
    *
    * @param movie Movie表对应实体
    * @return 影响行数
    */
    @Override
    public int updateMovie(Movie movie) {
        movie.setUpdateTime(DateTimeUtil.currentDateTime());
        return movieMapper.updateMovie(movie);
    }

    /**
    * Movie表根据主键批量修改
    *
    * @param movieList Movie表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateMovie(List<Movie> movieList) {
        return movieMapper.batchUpdateMovie(movieList);
    }


    /**
    * Movie表根据主键单条删除
    *
    * @param title Movie表主键
    * @param year Movie表主键
    * @param genre Movie表主键
    * @return 影响行数
    */
    @Override
    public int deleteMovieByTitleAndYearAndGenre(String title, Integer year, String genre) {
        return movieMapper.deleteMovieByTitleAndYearAndGenre(title, year, genre);
    }

    /**
    * Movie表条件删除
    *
    * @param movie Movie表
    *
    * @return Movie表被删除的记录条数
    */
    @Override
    public int deleteMovie(Movie movie){
        return movieMapper.deleteMovie(movie);
    }

    /**
    * Movie表批量删除
    *
    * @param movieList 需要删除的数据主键集合
    * @return Movie表被批量删除的记录条数
    */
    @Override
    public int batchDeleteMovie(List<Movie> movieList) {
        return movieMapper.batchDeleteMovie(movieList);
    }

    /**
    * Movie表根据主键批量删除
    *
    * @param titleArr Movie表主键数组
    * @param yearArr Movie表主键数组
    * @param genreArr Movie表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteMovieByTitleArrAndYearArrAndGenreArr(String[] titleArr, Integer[] yearArr, String[] genreArr) {
        return movieMapper.deleteMovieByTitleArrAndYearArrAndGenreArr(titleArr, yearArr, genreArr);
    }

    /**
    * Movie表保存，存在则更新，不存在则插入
    *
    * @param movie Movie表
    *
    * @return Movie表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveMovieByTitleAndYearAndGenre(Movie movie) {
        return movieMapper.saveMovieByTitleAndYearAndGenre(movie);
    }

    /**
    * Movie表批量保存，存在则更新，不存在则插入
    *
    * @param movieList Movie表
    *
    * @return Movie表受影响行数
    */
    @Override
    public int batchSaveMovieByTitleAndYearAndGenre(List<Movie> movieList) {
        return movieMapper.batchSaveMovieByTitleAndYearAndGenre(movieList);
    }
}

