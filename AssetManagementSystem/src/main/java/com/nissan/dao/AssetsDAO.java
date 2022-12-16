package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.AssetDefination;

public interface AssetsDAO extends JpaRepositoryImplementation<AssetDefination, Integer> {

}
