package com.dao.impl;

import com.dao.RoleDao;
import com.model.Role;
import org.springframework.stereotype.Repository;

@Repository("RoleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

}
