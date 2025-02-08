package com.example.performance.service.impl;

import com.example.performance.common.util.DateTimeUtil;
import com.example.performance.domain.Company;
import com.example.performance.mapper.CompanyMapper;
import com.example.performance.service.ICompanyService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Company表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.101
*/
public class CompanyServiceImpl implements ICompanyService
{
    @Inject
    private CompanyMapper companyMapper;

    /**
    * Company表根据主键单条查询
    *
    * @param no Company表主键
    * @return Company表
    */
    @Override
    public Company selectCompanyByNo(String no) {
        return companyMapper.selectCompanyByNo(no);
    }

    /**
    * Company表固定列组合条件查询
    *
    * @param company Company表查询条件
    * @return Company表结果集
    */
    @Override
    public List<Company> selectCompanyList(Company company) {
        return companyMapper.selectCompanyList(company);
    }

    /**
    * Company表固定列组合in查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    @Override
    public List<Company> companyFixedColumnInQuery(List<Company> companyList) {
        return companyMapper.companyFixedColumnInQuery(companyList);
    }

    /**
    * Company表多样列组合or查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    @Override
    public List<Company> companyMultiColumnOrQuery(List<Company> companyList) {
        return companyMapper.companyMultiColumnOrQuery(companyList);
    }

    /**
    * Company表多样列组合in查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    @Override
    public List<Company> companyMultiColumnInQuery(List<Company> companyList) {
        return companyMapper.companyMultiColumnInQuery(companyList);
    }

    /**
    * Company表多样列组合union查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    @Override
    public List<Company> companyMultiColumnUnionQuery(List<Company> companyList) {
        return companyMapper.companyMultiColumnUnionQuery(companyList);
    }

    /**
    * Company表多样列组合union all查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    @Override
    public List<Company> companyMultiColumnUnionAllQuery(List<Company> companyList) {
        return companyMapper.companyMultiColumnUnionAllQuery(companyList);
    }

    /**
    * Company表单条插入
    *
    * @param company Company表对应实体
    * @return 影响行数
    */
    @Override
    public int insertCompany(Company company) {
        company.setCreateTime(DateTimeUtil.currentDateTime());
        return companyMapper.insertCompany(company);
    }

    /**
    * Company表批量插入
    *
    * @param companyList Company表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertCompany(List<Company> companyList) {
        return companyMapper.batchInsertCompany(companyList);
    }

    /**
    * Company表根据主键修改单行
    *
    * @param company Company表对应实体
    * @return 影响行数
    */
    @Override
    public int updateCompany(Company company) {
        company.setUpdateTime(DateTimeUtil.currentDateTime());
        return companyMapper.updateCompany(company);
    }

    /**
    * Company表根据主键批量修改
    *
    * @param companyList Company表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateCompany(List<Company> companyList) {
        return companyMapper.batchUpdateCompany(companyList);
    }


    /**
    * Company表根据主键单条删除
    *
    * @param no Company表主键
    * @return 影响行数
    */
    @Override
    public int deleteCompanyByNo(String no) {
        return companyMapper.deleteCompanyByNo(no);
    }

    /**
    * Company表条件删除
    *
    * @param company Company表
    *
    * @return Company表被删除的记录条数
    */
    @Override
    public int deleteCompany(Company company){
        return companyMapper.deleteCompany(company);
    }

    /**
    * Company表批量删除
    *
    * @param companyList 需要删除的数据主键集合
    * @return Company表被批量删除的记录条数
    */
    @Override
    public int batchDeleteCompany(List<Company> companyList) {
        return companyMapper.batchDeleteCompany(companyList);
    }

    /**
    * Company表根据主键批量删除
    *
    * @param noArr Company表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteCompanyByNoArr(String[] noArr) {
        return companyMapper.deleteCompanyByNoArr(noArr);
    }

    /**
    * Company表保存，存在则更新，不存在则插入
    *
    * @param company Company表
    *
    * @return Company表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveCompanyByNo(Company company) {
        return companyMapper.saveCompanyByNo(company);
    }

    /**
    * Company表批量保存，存在则更新，不存在则插入
    *
    * @param companyList Company表
    *
    * @return Company表受影响行数
    */
    @Override
    public int batchSaveCompanyByNo(List<Company> companyList) {
        return companyMapper.batchSaveCompanyByNo(companyList);
    }
}

