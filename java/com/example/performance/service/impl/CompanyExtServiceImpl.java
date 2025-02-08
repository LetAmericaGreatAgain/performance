package com.example.performance.service.impl;

import com.example.performance.domain.Company;
import com.example.performance.mapper.CompanyExtMapper;
import com.example.performance.service.ICompanyExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Company表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.101
*/
public class CompanyExtServiceImpl implements ICompanyExtService
{
    @Inject
    private CompanyExtMapper companyExtMapper;


    /**
    * Company表自定义查询
    *
    * @return Company表结果集
    */
    @Override
    public List<Company> customMethod() {
        return companyExtMapper.customMethod();
    }


}

