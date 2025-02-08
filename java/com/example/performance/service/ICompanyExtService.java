package com.example.performance.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.performance.domain.Company;


/**
* Company表ExtService接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 09:36:32.101
*/
public interface ICompanyExtService
{
    /**
    * Company表自定义查询
    *
    * @return Company表集合
    */
    public List<Company> customMethod();


}

