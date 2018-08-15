package org.framestudy.springxml.usermag.dao.impl;

import org.framestudy.springxml.bean.UserBean;
import org.framestudy.springxml.usermag.dao.IUserDao;
/**
 * 用户持久层实现类
 * hibernate 框架的实现
 * @author puxubo
 *
 */
public class UserHibernateDaoImpl implements IUserDao {

	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		System.out.println(user);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		System.out.println(user);
	}

	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		System.out.println(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return null;
	}

}
