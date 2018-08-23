package com.service.impl;

import com.model.Member;
import com.service.MemberService;
import org.springframework.stereotype.Service;

@Service("MemberService")
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService {
}
