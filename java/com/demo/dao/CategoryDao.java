package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>{

}
