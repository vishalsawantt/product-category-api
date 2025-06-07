package com.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Transactional
@Service
public class ProductServiceImpl implements ProductService{
	    @Autowired
	    private ProductDao productDao;

	    @Override
	    public Page<Product> getAllProducts(Pageable pageable) {
	        return productDao.findAll(pageable);
	    }

	    @Override
	    public Product getProductById(int id) {
	        Optional<Product> optional = productDao.findById(id);
	        return optional.orElse(null);
	    }

	    @Override
	    public Product createProduct(Product product) {
	        return productDao.save(product);
	    }

	    @Override
	    public Product updateProduct(int id, Product product) {
	        Product existing = getProductById(id);
	        if (existing != null) {
	            existing.setName(product.getName());
	            existing.setPrice(product.getPrice());
	            existing.setCategory(product.getCategory());
	            return productDao.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteProduct(int id) {
	        productDao.deleteById(id);
	    }
}
