package com.example.performance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Movie;


/**
* Movie表Mapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.114
*/
public interface MovieMapper
{
    /**
    * Movie表根据主键查询
    *
    * @param title Movie表主键
    * @param year Movie表主键
    * @param genre Movie表主键
    * @return Movie表
    */
    public Movie selectMovieByTitleAndYearAndGenre(@Param("title")String title,@Param("year")Integer year,@Param("genre")String genre);

    /**
    * Movie表固定列组合条件查询
    *
    * @param movie Movie表
    * @return Movie表集合
    */
    public List<Movie> selectMovieList(Movie movie);

    /**
    * Movie表固定列组合in查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    public List<Movie> movieFixedColumnInQuery(List<Movie> movieList);

    /**
    * Movie表多样列组合or查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    public List<Movie> movieMultiColumnOrQuery(List<Movie> movieList);

    /**
    * Movie表多样列组合in查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    public List<Movie> movieMultiColumnInQuery(List<Movie> movieList);

    /**
    * Movie表多样列组合union查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    public List<Movie> movieMultiColumnUnionQuery(List<Movie> movieList);

    /**
    * Movie表多样列组合union all查询
    *
    * @param movieList Movie表
    * @return Movie表集合
    */
    public List<Movie> movieMultiColumnUnionAllQuery(List<Movie> movieList);

    /**
    * Movie表单条插入
    *
    * @param movie Movie表
    * @return 影响行数
    */
    public int insertMovie(Movie movie);

    /**
    * Movie表批量插入
    *
    * @param movieList Movie表
    * @return 影响行数
    */
    public int batchInsertMovie(List<Movie> movieList);

    /**
    * Movie表根据主键修改单条记录
    *
    * @param movie Movie表
    * @return Movie表被修改的记录条数
    */
    public int updateMovie(Movie movie);

    /**
    * Movie表根据主键批量修改
    *
    * @param movieList Movie表
    * @return Movie表被修改的记录条数
    */
    public int batchUpdateMovie(List<Movie> movieList);

    /**
    * Movie表单条删除
    *
    * @param title Movie表主键
    * @param year Movie表主键
    * @param genre Movie表主键
    * @return Movie表被删除的记录条数
    */
    public int deleteMovieByTitleAndYearAndGenre(@Param("title")String title, @Param("year")Integer year, @Param("genre")String genre);

    /**
    * Movie表条件删除
    *
    * @param movie Movie表
    *
    * @return Movie表被删除的记录条数
    */
    public int deleteMovie(Movie movie);


    /**
    * Movie表批量删除
    *
    * @param movieList 需要删除的数据主键集合
    * @return Movie表被批量删除的记录条数
    */
    public int batchDeleteMovie(List<Movie> movieList);

    /**
    * Movie表批量删除
    *
    * @param titleArr Movie表主键集合
    * @param yearArr Movie表主键集合
    * @param genreArr Movie表主键集合
    * @return Movie表被批量删除的记录条数
    */
    public int deleteMovieByTitleArrAndYearArrAndGenreArr(@Param("titleArr")String[] titleArr, @Param("yearArr")Integer[] yearArr, @Param("genreArr")String[] genreArr);

    /**
    * Movie表保存，存在则更新，不存在则插入
    *
    * @param movie Movie表
    *
    * @return Movie表受影响行数，更新返回2，插入返回1
    */
    public int saveMovieByTitleAndYearAndGenre(Movie movie);

    /**
    * Movie表批量保存，存在则更新，不存在则插入
    *
    * @param movieList Movie表
    *
    * @return Movie表受影响行数
    */
    public int batchSaveMovieByTitleAndYearAndGenre(List<Movie> movieList);

}

