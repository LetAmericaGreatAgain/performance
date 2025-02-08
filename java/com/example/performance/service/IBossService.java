package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Boss;


/**
* Boss表Service接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.097
*/
public interface IBossService
{
    /**
    * Boss表根据主键查询
    *
    * @param idCard Boss表主键
    * @return Boss表
    */
    public Boss selectBossByIdCard(String idCard);

    /**
    * Boss表固定列组合条件查询
    *
    * @param boss Boss表
    * @return Boss表集合
    */
    public List<Boss> selectBossList(Boss boss);

    /**
    * Boss表固定列组合in查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    public List<Boss> bossFixedColumnInQuery(List<Boss> bossList);

    /**
    * Boss表多样列组合or查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    public List<Boss> bossMultiColumnOrQuery(List<Boss> bossList);

    /**
    * Boss表多样列组合in查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    public List<Boss> bossMultiColumnInQuery(List<Boss> bossList);

    /**
    * Boss表多样列组合union查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    public List<Boss> bossMultiColumnUnionQuery(List<Boss> bossList);

    /**
    * Boss表多样列组合union all查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    public List<Boss> bossMultiColumnUnionAllQuery(List<Boss> bossList);

    /**
    * Boss表单条插入
    *
    * @param boss Boss表
    * @return 影响行数
    */
    public int insertBoss(Boss boss);

    /**
    * Boss表批量插入
    *
    * @param bossList Boss表
    * @return 影响行数
    */
    public int batchInsertBoss(List<Boss> bossList);

    /**
    * Boss表根据主键修改单条记录
    *
    * @param boss Boss表
    * @return Boss表被修改的记录条数
    */
    public int updateBoss(Boss boss);

    /**
    * Boss表根据主键批量修改
    *
    * @param bossList Boss表
    * @return Boss表被修改的记录条数
    */
    public int batchUpdateBoss(List<Boss> bossList);

    /**
    * Boss表单条删除
    *
    * @param idCard Boss表主键
    * @return Boss表被删除的记录条数
    */
    public int deleteBossByIdCard(String idCard);

    /**
    * Boss表条件删除
    *
    * @param boss Boss表
    *
    * @return Boss表被删除的记录条数
    */
    public int deleteBoss(Boss boss);

    /**
    * Boss表批量删除
    *
    * @param bossList 需要删除的数据主键集合
    * @return Boss表被批量删除的记录条数
    */
    public int batchDeleteBoss(List<Boss> bossList);

    /**
    * Boss表批量删除
    *
    * @param idCardArr Boss表主键集合
    * @return Boss表被批量删除的记录条数
    */
    public int deleteBossByIdCardArr(@Param("idCardArr")String[] idCardArr);

    /**
    * Boss表保存，存在则更新，不存在则插入
    *
    * @param boss Boss表
    *
    * @return Boss表受影响行数，更新返回2，插入返回1
    */
    public int saveBossByIdCard(Boss boss);

    /**
    * Boss表批量保存，存在则更新，不存在则插入
    *
    * @param bossList Boss表
    *
    * @return Boss表受影响行数
    */
    public int batchSaveBossByIdCard(List<Boss> bossList);

}

