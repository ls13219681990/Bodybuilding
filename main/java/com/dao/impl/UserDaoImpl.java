package com.dao.impl;

import com.dao.UserDao;
import com.model.User;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
