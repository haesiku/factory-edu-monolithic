package com.factory.samples.edu.monolithic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factory.samples.edu.monolithic.domain.model.Admin;
import com.factory.samples.edu.monolithic.domain.repository.AdminRepository;
import com.factory.samples.edu.monolithic.service.AdminService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {
	private final AdminRepository adminRepository;

	@Override
	public Admin selectAdminByEmail(String email) {
		return adminRepository.selectAdminByEmail(email);
	}

	@Override
	public Admin selectAdminById(Long id) {
		return adminRepository.selectAdminById(id);
	}

	@Override
	public List<Admin> selectAllAdmin() {
		return adminRepository.selectAllAdmin();
	}

}
