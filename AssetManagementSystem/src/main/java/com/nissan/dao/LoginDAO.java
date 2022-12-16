package com.nissan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Login;
import com.nissan.model.UserRegistration;
@Repository
public interface LoginDAO extends CrudRepository<Login, Integer> {
	Login findOneByLoginId(Integer loginId);
}
