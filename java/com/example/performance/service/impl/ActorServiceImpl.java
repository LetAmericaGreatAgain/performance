package com.example.performance.service.impl;

import com.example.performance.common.util.DateTimeUtil;
import com.example.performance.domain.Actor;
import com.example.performance.mapper.ActorMapper;
import com.example.performance.service.IActorService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Actor表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.083
*/
public class ActorServiceImpl implements IActorService
{
    @Inject
    private ActorMapper actorMapper;

    /**
    * Actor表根据主键单条查询
    *
    * @param firstName Actor表主键
    * @param lastName Actor表主键
    * @return Actor表
    */
    @Override
    public Actor selectActorByFirstNameAndLastName(String firstName, String lastName) {
        return actorMapper.selectActorByFirstNameAndLastName(firstName, lastName);
    }

    /**
    * Actor表固定列组合条件查询
    *
    * @param actor Actor表查询条件
    * @return Actor表结果集
    */
    @Override
    public List<Actor> selectActorList(Actor actor) {
        return actorMapper.selectActorList(actor);
    }

    /**
    * Actor表固定列组合in查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    @Override
    public List<Actor> actorFixedColumnInQuery(List<Actor> actorList) {
        return actorMapper.actorFixedColumnInQuery(actorList);
    }

    /**
    * Actor表多样列组合or查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    @Override
    public List<Actor> actorMultiColumnOrQuery(List<Actor> actorList) {
        return actorMapper.actorMultiColumnOrQuery(actorList);
    }

    /**
    * Actor表多样列组合in查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    @Override
    public List<Actor> actorMultiColumnInQuery(List<Actor> actorList) {
        return actorMapper.actorMultiColumnInQuery(actorList);
    }

    /**
    * Actor表多样列组合union查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    @Override
    public List<Actor> actorMultiColumnUnionQuery(List<Actor> actorList) {
        return actorMapper.actorMultiColumnUnionQuery(actorList);
    }

    /**
    * Actor表多样列组合union all查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    @Override
    public List<Actor> actorMultiColumnUnionAllQuery(List<Actor> actorList) {
        return actorMapper.actorMultiColumnUnionAllQuery(actorList);
    }

    /**
    * Actor表单条插入
    *
    * @param actor Actor表对应实体
    * @return 影响行数
    */
    @Override
    public int insertActor(Actor actor) {
        actor.setCreateTime(DateTimeUtil.currentDateTime());
        return actorMapper.insertActor(actor);
    }

    /**
    * Actor表批量插入
    *
    * @param actorList Actor表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertActor(List<Actor> actorList) {
        return actorMapper.batchInsertActor(actorList);
    }

    /**
    * Actor表根据主键修改单行
    *
    * @param actor Actor表对应实体
    * @return 影响行数
    */
    @Override
    public int updateActor(Actor actor) {
        actor.setUpdateTime(DateTimeUtil.currentDateTime());
        return actorMapper.updateActor(actor);
    }

    /**
    * Actor表根据主键批量修改
    *
    * @param actorList Actor表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateActor(List<Actor> actorList) {
        return actorMapper.batchUpdateActor(actorList);
    }


    /**
    * Actor表根据主键单条删除
    *
    * @param firstName Actor表主键
    * @param lastName Actor表主键
    * @return 影响行数
    */
    @Override
    public int deleteActorByFirstNameAndLastName(String firstName, String lastName) {
        return actorMapper.deleteActorByFirstNameAndLastName(firstName, lastName);
    }

    /**
    * Actor表条件删除
    *
    * @param actor Actor表
    *
    * @return Actor表被删除的记录条数
    */
    @Override
    public int deleteActor(Actor actor){
        return actorMapper.deleteActor(actor);
    }

    /**
    * Actor表批量删除
    *
    * @param actorList 需要删除的数据主键集合
    * @return Actor表被批量删除的记录条数
    */
    @Override
    public int batchDeleteActor(List<Actor> actorList) {
        return actorMapper.batchDeleteActor(actorList);
    }

    /**
    * Actor表根据主键批量删除
    *
    * @param firstNameArr Actor表主键数组
    * @param lastNameArr Actor表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteActorByFirstNameArrAndLastNameArr(String[] firstNameArr, String[] lastNameArr) {
        return actorMapper.deleteActorByFirstNameArrAndLastNameArr(firstNameArr, lastNameArr);
    }

    /**
    * Actor表保存，存在则更新，不存在则插入
    *
    * @param actor Actor表
    *
    * @return Actor表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveActorByFirstNameAndLastName(Actor actor) {
        return actorMapper.saveActorByFirstNameAndLastName(actor);
    }

    /**
    * Actor表批量保存，存在则更新，不存在则插入
    *
    * @param actorList Actor表
    *
    * @return Actor表受影响行数
    */
    @Override
    public int batchSaveActorByFirstNameAndLastName(List<Actor> actorList) {
        return actorMapper.batchSaveActorByFirstNameAndLastName(actorList);
    }
}

