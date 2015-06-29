package com.stock.dao.impl;

import org.springframework.stereotype.Repository;

import com.stock.dao.CompanyDao;
import com.stock.vo.Company;

@Repository(value = "companyDao")
public class CompanyDaoImpl extends BaseDaoImpl<Company> implements CompanyDao {

}
