package com.aton.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aton.products.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{

}
