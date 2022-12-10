package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dao.CalcDao;
import com.example.daoimpl.CalcDaoImpl;

@Service
public class CalcService {
//	// @Autowired
//	private CalcDao calcDao;
//
//	public CalcService(CalcDao calcDao) {
//		super();
//		this.calcDao = calcDao;
//	}

	public int testAdd(int x, int y) {
		CalcDao c = new CalcDaoImpl();
		return c.addNo(x, y);
	}

}
