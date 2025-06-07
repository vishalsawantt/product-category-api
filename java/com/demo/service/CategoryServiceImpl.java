package com.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.demo.dao.CategoryDao;
import com.demo.model.Category;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao cd;
	
	@Override
    public Page<Category> getAllCategories(Pageable pageable) {
        return cd.findAll(pageable);
    }

    @Override
    public Category getCategoryById(int id) {
        Optional<Category> category = cd.findById(id);
        return category.orElse(null); 
    }

    @Override
    public Category createCategory(Category category) {
        return cd.save(category);
    }

    @Override
    public Category updateCategory(int id, Category updatedCategory) {
        Optional<Category> optional = cd.findById(id);
        if (optional.isPresent()) {
            Category existingCategory = optional.get();
            existingCategory.setName(updatedCategory.getName()); 
            return cd.save(existingCategory);
        } else {
            return null; 
        }
    }

    @Override
    public void deleteCategory(int id) {
        cd.deleteById(id);
    }
}
