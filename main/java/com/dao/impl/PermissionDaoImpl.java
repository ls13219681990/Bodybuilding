package com.dao.impl;

import com.dao.PermissionDao;
import com.model.Permission;
import org.springframework.stereotype.Repository;

@Repository("PermissionDao")
public class PermissionDaoImpl extends BaseDaoImpl<Permission> implements PermissionDao {

}
