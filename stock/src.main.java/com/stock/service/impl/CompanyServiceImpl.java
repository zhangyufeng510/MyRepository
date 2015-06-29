package com.stock.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.CompanyDao;
import com.stock.service.CompanyService;
import com.stock.vo.Company;

@Service("companyService")
@Transactional
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService{
	
	
	private CompanyDao companyDao;

	@Resource(name = "companyDao")
	public void setCompanyDao(CompanyDao companyDao) {
		super.setBaseDao(companyDao);
		this.companyDao = companyDao;
	}
	
	

	
}
