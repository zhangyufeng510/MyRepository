package com.stock.service;


import com.stock.vo.Company;

public interface CompanyService extends BaseService<Company>{
	 
	public int findCountByCodeAndName(String code, String name);
}
