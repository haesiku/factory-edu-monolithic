package com.factory.samples.edu.monolithic.service;

import java.util.List;

import com.factory.samples.edu.monolithic.domain.model.Admin;

public interface AdminService {
	Admin selectAdminByEmail(String email);
	Admin selectAdminById(Long id);
	List<Admin> selectAllAdmin();
}
