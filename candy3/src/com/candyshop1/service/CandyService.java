package com.candyshop1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candyshop1.dao.CandyDao;
import com.candyshop1.entity.UserBean;

@Service
public class CandyService {

	@Autowired
	private CandyDao theDao;
	
	@Transactional
	public void addUser(UserBean user) {
		
		theDao.addUser(user);
	}
	@Transactional
	public void updateUser(UserBean user) {
		theDao.updateUser(user);		
	}
	
	
}
