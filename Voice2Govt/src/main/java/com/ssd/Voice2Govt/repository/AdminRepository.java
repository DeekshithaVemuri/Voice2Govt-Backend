package com.ssd.Voice2Govt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.Voice2Govt.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

	Optional<Admin> findByAdm_username(String username);
}
