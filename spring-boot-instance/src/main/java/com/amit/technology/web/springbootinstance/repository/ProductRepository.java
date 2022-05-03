package com.amit.technology.web.springbootinstance.repository;

import org.springframework.data.repository.CrudRepository;

import com.amit.technology.web.springbootinstance.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
