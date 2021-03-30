package com.factory.samples.edu.monolithic.service;

import java.util.List;

import com.factory.samples.edu.monolithic.domain.model.Member;

public interface MemberService {
	List<Member> selectAllMember();
	Member selectMemberById(Long id);
}
