package com.stock.dao.impl;


import org.springframework.stereotype.Repository;

import com.stock.dao.CompanyDao;
import com.stock.vo.Company;

@Repository(value = "companyDao")
public class CompanyDaoImpl extends BaseDaoImpl<Company> implements CompanyDao {

	@Override
	public int findCountByNameAndCode(String code, String name) {
		
		String hql = "select count(*) from Company where code = ? and name = ?";
		
		return this.findCountByHQL(hql, code, name);
		
	}

}
