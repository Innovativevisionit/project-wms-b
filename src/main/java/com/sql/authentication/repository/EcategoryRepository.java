package com.sql.authentication.repository;

import com.sql.authentication.model.Ecategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EcategoryRepository extends JpaRepository<Ecategory,Integer> {
    boolean existsByName(String name);
    List<Ecategory> findAllByStatus(int i);
}
