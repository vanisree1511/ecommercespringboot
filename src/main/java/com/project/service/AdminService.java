package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository arepo;
	
	public List<Admin> fetchAll() {
		return arepo.findAll();
	}
	public void save(Admin a) {
		arepo.save(a);
	}

}
