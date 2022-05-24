package com.cts.springorm.product.productDao;

import java.util.List;

import com.cts.springorm.product.entity.Product;

public interface productDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> findAll();
}
