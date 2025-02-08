package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Actor;


/**
* Actor表Service接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.083
*/
public interface IActorService
{
    /**
    * Actor表根据主键查询
    *
    * @param firstName Actor表主键
    * @param lastName Actor表主键
    * @return Actor表
    */
    public Actor selectActorByFirstNameAndLastName(String firstName,String lastName);

    /**
    * Actor表固定列组合条件查询
    *
    * @param actor Actor表
    * @return Actor表集合
    */
    public List<Actor> selectActorList(Actor actor);

    /**
    * Actor表固定列组合in查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    public List<Actor> actorFixedColumnInQuery(List<Actor> actorList);

    /**
    * Actor表多样列组合or查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    public List<Actor> actorMultiColumnOrQuery(List<Actor> actorList);

    /**
    * Actor表多样列组合in查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    public List<Actor> actorMultiColumnInQuery(List<Actor> actorList);

    /**
    * Actor表多样列组合union查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    public List<Actor> actorMultiColumnUnionQuery(List<Actor> actorList);

    /**
    * Actor表多样列组合union all查询
    *
    * @param actorList Actor表
    * @return Actor表集合
    */
    public List<Actor> actorMultiColumnUnionAllQuery(List<Actor> actorList);

    /**
    * Actor表单条插入
    *
    * @param actor Actor表
    * @return 影响行数
    */
    public int insertActor(Actor actor);

    /**
    * Actor表批量插入
    *
    * @param actorList Actor表
    * @return 影响行数
    */
    public int batchInsertActor(List<Actor> actorList);

    /**
    * Actor表根据主键修改单条记录
    *
    * @param actor Actor表
    * @return Actor表被修改的记录条数
    */
    public int updateActor(Actor actor);

    /**
    * Actor表根据主键批量修改
    *
    * @param actorList Actor表
    * @return Actor表被修改的记录条数
    */
    public int batchUpdateActor(List<Actor> actorList);

    /**
    * Actor表单条删除
    *
    * @param firstName Actor表主键
    * @param lastName Actor表主键
    * @return Actor表被删除的记录条数
    */
    public int deleteActorByFirstNameAndLastName(String firstName, String lastName);

    /**
    * Actor表条件删除
    *
    * @param actor Actor表
    *
    * @return Actor表被删除的记录条数
    */
    public int deleteActor(Actor actor);

    /**
    * Actor表批量删除
    *
    * @param actorList 需要删除的数据主键集合
    * @return Actor表被批量删除的记录条数
    */
    public int batchDeleteActor(List<Actor> actorList);

    /**
    * Actor表批量删除
    *
    * @param firstNameArr Actor表主键集合
    * @param lastNameArr Actor表主键集合
    * @return Actor表被批量删除的记录条数
    */
    public int deleteActorByFirstNameArrAndLastNameArr(@Param("firstNameArr")String[] firstNameArr, @Param("lastNameArr")String[] lastNameArr);

    /**
    * Actor表保存，存在则更新，不存在则插入
    *
    * @param actor Actor表
    *
    * @return Actor表受影响行数，更新返回2，插入返回1
    */
    public int saveActorByFirstNameAndLastName(Actor actor);

    /**
    * Actor表批量保存，存在则更新，不存在则插入
    *
    * @param actorList Actor表
    *
    * @return Actor表受影响行数
    */
    public int batchSaveActorByFirstNameAndLastName(List<Actor> actorList);

}

