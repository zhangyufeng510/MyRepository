package com.stock.dao;


import com.stock.vo.Company;

public interface CompanyDao extends BaseDao<Company> {
	
	public int findCountByNameAndCode(String code, String name);

}
