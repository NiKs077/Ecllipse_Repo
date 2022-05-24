package com.cts.springorm.product.entity.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springorm.product.entity.Product;
import com.cts.springorm.product.productDao.productDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/cts/springorm/product/entity/test/XMLConfig.xml");
//		Product product = (Product) ctx.getBean("product");
		productDao dao = (productDao) ctx.getBean("productDaoImpl");
//		product1.setDesc("good");
//		product1.setPrice(14000);
//		product.setId(1);
//		dao.delete(product);
//		System.out.println("the inserted record and the rows affected are:"+result);
//		Product product = dao.get(1);
	//	List<Product> products = dao.findAll();
	//	System.out.println(products);
	}
}
