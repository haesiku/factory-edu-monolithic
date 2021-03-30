package com.factory.samples.edu.monolithic.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.factory.samples.edu.monolithic.domain.model.Admin;

@Mapper
@Repository
public interface AdminRepository {
	Admin selectAdminByEmail(String email);
	Admin selectAdminById(Long id);
	List<Admin> selectAllAdmin();
}