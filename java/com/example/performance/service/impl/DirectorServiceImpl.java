package com.example.performance.service.impl;

import com.example.performance.common.util.DateTimeUtil;
import com.example.performance.domain.Director;
import com.example.performance.mapper.DirectorMapper;
import com.example.performance.service.IDirectorService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Director表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.112
*/
public class DirectorServiceImpl implements IDirectorService
{
    @Inject
    private DirectorMapper directorMapper;

    /**
    * Director表根据主键单条查询
    *
    * @param firstName Director表主键
    * @param lastName Director表主键
    * @return Director表
    */
    @Override
    public Director selectDirectorByFirstNameAndLastName(String firstName, String lastName) {
        return directorMapper.selectDirectorByFirstNameAndLastName(firstName, lastName);
    }

    /**
    * Director表固定列组合条件查询
    *
    * @param director Director表查询条件
    * @return Director表结果集
    */
    @Override
    public List<Director> selectDirectorList(Director director) {
        return directorMapper.selectDirectorList(director);
    }

    /**
    * Director表固定列组合in查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    @Override
    public List<Director> directorFixedColumnInQuery(List<Director> directorList) {
        return directorMapper.directorFixedColumnInQuery(directorList);
    }

    /**
    * Director表多样列组合or查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    @Override
    public List<Director> directorMultiColumnOrQuery(List<Director> directorList) {
        return directorMapper.directorMultiColumnOrQuery(directorList);
    }

    /**
    * Director表多样列组合in查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    @Override
    public List<Director> directorMultiColumnInQuery(List<Director> directorList) {
        return directorMapper.directorMultiColumnInQuery(directorList);
    }

    /**
    * Director表多样列组合union查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    @Override
    public List<Director> directorMultiColumnUnionQuery(List<Director> directorList) {
        return directorMapper.directorMultiColumnUnionQuery(directorList);
    }

    /**
    * Director表多样列组合union all查询
    *
    * @param directorList Director表
    * @return Director表集合
    */
    @Override
    public List<Director> directorMultiColumnUnionAllQuery(List<Director> directorList) {
        return directorMapper.directorMultiColumnUnionAllQuery(directorList);
    }

    /**
    * Director表单条插入
    *
    * @param director Director表对应实体
    * @return 影响行数
    */
    @Override
    public int insertDirector(Director director) {
        director.setCreateTime(DateTimeUtil.currentDateTime());
        return directorMapper.insertDirector(director);
    }

    /**
    * Director表批量插入
    *
    * @param directorList Director表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertDirector(List<Director> directorList) {
        return directorMapper.batchInsertDirector(directorList);
    }

    /**
    * Director表根据主键修改单行
    *
    * @param director Director表对应实体
    * @return 影响行数
    */
    @Override
    public int updateDirector(Director director) {
        director.setUpdateTime(DateTimeUtil.currentDateTime());
        return directorMapper.updateDirector(director);
    }

    /**
    * Director表根据主键批量修改
    *
    * @param directorList Director表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateDirector(List<Director> directorList) {
        return directorMapper.batchUpdateDirector(directorList);
    }


    /**
    * Director表根据主键单条删除
    *
    * @param firstName Director表主键
    * @param lastName Director表主键
    * @return 影响行数
    */
    @Override
    public int deleteDirectorByFirstNameAndLastName(String firstName, String lastName) {
        return directorMapper.deleteDirectorByFirstNameAndLastName(firstName, lastName);
    }

    /**
    * Director表条件删除
    *
    * @param director Director表
    *
    * @return Director表被删除的记录条数
    */
    @Override
    public int deleteDirector(Director director){
        return directorMapper.deleteDirector(director);
    }

    /**
    * Director表批量删除
    *
    * @param directorList 需要删除的数据主键集合
    * @return Director表被批量删除的记录条数
    */
    @Override
    public int batchDeleteDirector(List<Director> directorList) {
        return directorMapper.batchDeleteDirector(directorList);
    }

    /**
    * Director表根据主键批量删除
    *
    * @param firstNameArr Director表主键数组
    * @param lastNameArr Director表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteDirectorByFirstNameArrAndLastNameArr(String[] firstNameArr, String[] lastNameArr) {
        return directorMapper.deleteDirectorByFirstNameArrAndLastNameArr(firstNameArr, lastNameArr);
    }

    /**
    * Director表保存，存在则更新，不存在则插入
    *
    * @param director Director表
    *
    * @return Director表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveDirectorByFirstNameAndLastName(Director director) {
        return directorMapper.saveDirectorByFirstNameAndLastName(director);
    }

    /**
    * Director表批量保存，存在则更新，不存在则插入
    *
    * @param directorList Director表
    *
    * @return Director表受影响行数
    */
    @Override
    public int batchSaveDirectorByFirstNameAndLastName(List<Director> directorList) {
        return directorMapper.batchSaveDirectorByFirstNameAndLastName(directorList);
    }
}

