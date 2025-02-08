package com.example.performance.service.impl;

import com.example.performance.common.util.DateTimeUtil;
import com.example.performance.domain.Boss;
import com.example.performance.mapper.BossMapper;
import com.example.performance.service.IBossService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Boss表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.097
*/
public class BossServiceImpl implements IBossService
{
    @Inject
    private BossMapper bossMapper;

    /**
    * Boss表根据主键单条查询
    *
    * @param idCard Boss表主键
    * @return Boss表
    */
    @Override
    public Boss selectBossByIdCard(String idCard) {
        return bossMapper.selectBossByIdCard(idCard);
    }

    /**
    * Boss表固定列组合条件查询
    *
    * @param boss Boss表查询条件
    * @return Boss表结果集
    */
    @Override
    public List<Boss> selectBossList(Boss boss) {
        return bossMapper.selectBossList(boss);
    }

    /**
    * Boss表固定列组合in查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    @Override
    public List<Boss> bossFixedColumnInQuery(List<Boss> bossList) {
        return bossMapper.bossFixedColumnInQuery(bossList);
    }

    /**
    * Boss表多样列组合or查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    @Override
    public List<Boss> bossMultiColumnOrQuery(List<Boss> bossList) {
        return bossMapper.bossMultiColumnOrQuery(bossList);
    }

    /**
    * Boss表多样列组合in查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    @Override
    public List<Boss> bossMultiColumnInQuery(List<Boss> bossList) {
        return bossMapper.bossMultiColumnInQuery(bossList);
    }

    /**
    * Boss表多样列组合union查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    @Override
    public List<Boss> bossMultiColumnUnionQuery(List<Boss> bossList) {
        return bossMapper.bossMultiColumnUnionQuery(bossList);
    }

    /**
    * Boss表多样列组合union all查询
    *
    * @param bossList Boss表
    * @return Boss表集合
    */
    @Override
    public List<Boss> bossMultiColumnUnionAllQuery(List<Boss> bossList) {
        return bossMapper.bossMultiColumnUnionAllQuery(bossList);
    }

    /**
    * Boss表单条插入
    *
    * @param boss Boss表对应实体
    * @return 影响行数
    */
    @Override
    public int insertBoss(Boss boss) {
        boss.setCreateTime(DateTimeUtil.currentDateTime());
        return bossMapper.insertBoss(boss);
    }

    /**
    * Boss表批量插入
    *
    * @param bossList Boss表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertBoss(List<Boss> bossList) {
        return bossMapper.batchInsertBoss(bossList);
    }

    /**
    * Boss表根据主键修改单行
    *
    * @param boss Boss表对应实体
    * @return 影响行数
    */
    @Override
    public int updateBoss(Boss boss) {
        boss.setUpdateTime(DateTimeUtil.currentDateTime());
        return bossMapper.updateBoss(boss);
    }

    /**
    * Boss表根据主键批量修改
    *
    * @param bossList Boss表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateBoss(List<Boss> bossList) {
        return bossMapper.batchUpdateBoss(bossList);
    }


    /**
    * Boss表根据主键单条删除
    *
    * @param idCard Boss表主键
    * @return 影响行数
    */
    @Override
    public int deleteBossByIdCard(String idCard) {
        return bossMapper.deleteBossByIdCard(idCard);
    }

    /**
    * Boss表条件删除
    *
    * @param boss Boss表
    *
    * @return Boss表被删除的记录条数
    */
    @Override
    public int deleteBoss(Boss boss){
        return bossMapper.deleteBoss(boss);
    }

    /**
    * Boss表批量删除
    *
    * @param bossList 需要删除的数据主键集合
    * @return Boss表被批量删除的记录条数
    */
    @Override
    public int batchDeleteBoss(List<Boss> bossList) {
        return bossMapper.batchDeleteBoss(bossList);
    }

    /**
    * Boss表根据主键批量删除
    *
    * @param idCardArr Boss表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteBossByIdCardArr(String[] idCardArr) {
        return bossMapper.deleteBossByIdCardArr(idCardArr);
    }

    /**
    * Boss表保存，存在则更新，不存在则插入
    *
    * @param boss Boss表
    *
    * @return Boss表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveBossByIdCard(Boss boss) {
        return bossMapper.saveBossByIdCard(boss);
    }

    /**
    * Boss表批量保存，存在则更新，不存在则插入
    *
    * @param bossList Boss表
    *
    * @return Boss表受影响行数
    */
    @Override
    public int batchSaveBossByIdCard(List<Boss> bossList) {
        return bossMapper.batchSaveBossByIdCard(bossList);
    }
}

