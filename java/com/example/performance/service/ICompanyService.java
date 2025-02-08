package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Company;


/**
* Company表Service接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.101
*/
public interface ICompanyService
{
    /**
    * Company表根据主键查询
    *
    * @param no Company表主键
    * @return Company表
    */
    public Company selectCompanyByNo(String no);

    /**
    * Company表固定列组合条件查询
    *
    * @param company Company表
    * @return Company表集合
    */
    public List<Company> selectCompanyList(Company company);

    /**
    * Company表固定列组合in查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    public List<Company> companyFixedColumnInQuery(List<Company> companyList);

    /**
    * Company表多样列组合or查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    public List<Company> companyMultiColumnOrQuery(List<Company> companyList);

    /**
    * Company表多样列组合in查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    public List<Company> companyMultiColumnInQuery(List<Company> companyList);

    /**
    * Company表多样列组合union查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    public List<Company> companyMultiColumnUnionQuery(List<Company> companyList);

    /**
    * Company表多样列组合union all查询
    *
    * @param companyList Company表
    * @return Company表集合
    */
    public List<Company> companyMultiColumnUnionAllQuery(List<Company> companyList);

    /**
    * Company表单条插入
    *
    * @param company Company表
    * @return 影响行数
    */
    public int insertCompany(Company company);

    /**
    * Company表批量插入
    *
    * @param companyList Company表
    * @return 影响行数
    */
    public int batchInsertCompany(List<Company> companyList);

    /**
    * Company表根据主键修改单条记录
    *
    * @param company Company表
    * @return Company表被修改的记录条数
    */
    public int updateCompany(Company company);

    /**
    * Company表根据主键批量修改
    *
    * @param companyList Company表
    * @return Company表被修改的记录条数
    */
    public int batchUpdateCompany(List<Company> companyList);

    /**
    * Company表单条删除
    *
    * @param no Company表主键
    * @return Company表被删除的记录条数
    */
    public int deleteCompanyByNo(String no);

    /**
    * Company表条件删除
    *
    * @param company Company表
    *
    * @return Company表被删除的记录条数
    */
    public int deleteCompany(Company company);

    /**
    * Company表批量删除
    *
    * @param companyList 需要删除的数据主键集合
    * @return Company表被批量删除的记录条数
    */
    public int batchDeleteCompany(List<Company> companyList);

    /**
    * Company表批量删除
    *
    * @param noArr Company表主键集合
    * @return Company表被批量删除的记录条数
    */
    public int deleteCompanyByNoArr(@Param("noArr")String[] noArr);

    /**
    * Company表保存，存在则更新，不存在则插入
    *
    * @param company Company表
    *
    * @return Company表受影响行数，更新返回2，插入返回1
    */
    public int saveCompanyByNo(Company company);

    /**
    * Company表批量保存，存在则更新，不存在则插入
    *
    * @param companyList Company表
    *
    * @return Company表受影响行数
    */
    public int batchSaveCompanyByNo(List<Company> companyList);

}

