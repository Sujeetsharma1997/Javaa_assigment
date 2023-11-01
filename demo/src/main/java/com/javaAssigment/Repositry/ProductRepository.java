package com.javaAssigment.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaAssigment.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
	
}
