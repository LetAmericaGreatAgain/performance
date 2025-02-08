package com.example.performance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Director;


/**
* Director表Mapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.112
*/
public interface DirectorMapper
{
    /**
    * Director表根据主键查询
    *
    * @param firstName Director表主键
    * @param lastName Director表主键
    * @return Director表
    */
    public Director selectDirectorByFirstNameAndLastName(@Param("firstName")String firstName,@Param("lastName")String lastName);

    /**
    * Director表固定列组合条件查询
    *
    * @param director Director表
    * @return Director表集合
    */
    public List<Director> selectDirectorList(Director director);

    /**
    * Director表固定列组合in查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    public List<Director> directorFixedColumnInQuery(List<Director> directorList);

    /**
    * Director表多样列组合or查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    public List<Director> directorMultiColumnOrQuery(List<Director> directorList);

    /**
    * Director表多样列组合in查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    public List<Director> directorMultiColumnInQuery(List<Director> directorList);

    /**
    * Director表多样列组合union查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    public List<Director> directorMultiColumnUnionQuery(List<Director> directorList);

    /**
    * Director表多样列组合union all查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    public List<Director> directorMultiColumnUnionAllQuery(List<Director> directorList);

    /**
    * Director表单条插入
    *
    * @param director Director表
    * @return 影响行数
    */
    public int insertDirector(Director director);

    /**
    * Director表批量插入
    *
    * @param directorList Director表
    * @return 影响行数
    */
    public int batchInsertDirector(List<Director> directorList);

    /**
    * Director表根据主键修改单条记录
    *
    * @param director Director表
    * @return Director表被修改的记录条数
    */
    public int updateDirector(Director director);

    /**
    * Director表根据主键批量修改
    *
    * @param directorList Director表
    * @return Director表被修改的记录条数
    */
    public int batchUpdateDirector(List<Director> directorList);

    /**
    * Director表单条删除
    *
    * @param firstName Director表主键
    * @param lastName Director表主键
    * @return Director表被删除的记录条数
    */
    public int deleteDirectorByFirstNameAndLastName(@Param("firstName")String firstName, @Param("lastName")String lastName);

    /**
    * Director表条件删除
    *
    * @param director Director表
    *
    * @return Director表被删除的记录条数
    */
    public int deleteDirector(Director director);


    /**
    * Director表批量删除
    *
    * @param directorList 需要删除的数据主键集合
    * @return Director表被批量删除的记录条数
    */
    public int batchDeleteDirector(List<Director> directorList);

    /**
    * Director表批量删除
    *
    * @param firstNameArr Director表主键集合
    * @param lastNameArr Director表主键集合
    * @return Director表被批量删除的记录条数
    */
    public int deleteDirectorByFirstNameArrAndLastNameArr(@Param("firstNameArr")String[] firstNameArr, @Param("lastNameArr")String[] lastNameArr);

    /**
    * Director表保存，存在则更新，不存在则插入
    *
    * @param director Director表
    *
    * @return Director表受影响行数，更新返回2，插入返回1
    */
    public int saveDirectorByFirstNameAndLastName(Director director);

    /**
    * Director表批量保存，存在则更新，不存在则插入
    *
    * @param directorList Director表
    *
    * @return Director表受影响行数
    */
    public int batchSaveDirectorByFirstNameAndLastName(List<Director> directorList);

}

