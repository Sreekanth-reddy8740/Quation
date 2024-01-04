package com.Microservices.QuationProject.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Microservices.QuationProject.Model.QuationEntity;

@Repository
public interface QuationDao extends JpaRepository<QuationEntity, Integer> {

	List<QuationEntity>findByCategory(String category);

	@Query(value = "SELECT q.id FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
