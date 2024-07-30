package com.project.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

	

}
