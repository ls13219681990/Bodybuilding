package com.dao.impl;

import com.dao.MemberDao;
import com.model.Member;
import org.springframework.stereotype.Repository;

@Repository("MemberDao")
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

}
