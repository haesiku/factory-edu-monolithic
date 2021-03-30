package com.factory.samples.edu.monolithic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factory.samples.edu.monolithic.domain.model.Member;
import com.factory.samples.edu.monolithic.domain.repository.MemberRepository;
import com.factory.samples.edu.monolithic.service.MemberService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;

	@Override
	public List<Member> selectAllMember() {
		return memberRepository.selectAllMember();
	}

	@Override
	public Member selectMemberById(Long id) {
		return memberRepository.selectMemberById(id);
	}

}
