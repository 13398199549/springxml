package org.framestudy.springxml.usermag.service.impl;

import org.framestudy.springxml.bean.UserBean;
import org.framestudy.springxml.usermag.dao.IUserDao;
import org.framestudy.springxml.usermag.service.IUserService;
/**
 * 用户业务实现类
 * @author puxubo
 *
 */
public class UserServiceImpl implements IUserService {

	private IUserDao userDaoImpl;
	
	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserServiceImpl(IUserDao userDaoImpl) {
		super();
		this.userDaoImpl = userDaoImpl;
	}
	
	public void setUserDaoImpl(IUserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.saveUserBean(user);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.updateUserBean(user);
	}

	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUserBean(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	}

}
