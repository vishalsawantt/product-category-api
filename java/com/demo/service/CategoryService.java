package com.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.demo.model.Category;

public interface CategoryService {
	Page<Category> getAllCategories(Pageable pageable);

	Category getCategoryById(int id);

	Category createCategory(Category category);

	Category updateCategory(int id, Category category);

	void deleteCategory(int id);
}
