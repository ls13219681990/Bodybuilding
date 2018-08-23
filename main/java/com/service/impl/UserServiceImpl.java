package com.service.impl;

import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
}
