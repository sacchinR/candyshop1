package com.candyshop1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.candyshop1.entity.UserBean;

@Repository
public class CandyDao {

	@Autowired
	private SessionFactory factory;
	
	public void addUser(UserBean user) {
		Session session=factory.getCurrentSession();
		session.save(user);
	}

	public void updateUser(UserBean user) {
		Session session=factory.getCurrentSession();
		List<UserBean> li=(List<UserBean>) session.createQuery("from UserBean where email='"+user.getEmail()+"'");
		for(UserBean updateUser:li) {
		updateUser.setPassword(user.getPassword());
		session.update(updateUser);
		}
	}

}
