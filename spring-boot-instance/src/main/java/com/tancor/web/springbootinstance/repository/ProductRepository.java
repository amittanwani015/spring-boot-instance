package com.tancor.web.springbootinstance.repository;

import org.springframework.data.repository.CrudRepository;

import com.tancor.web.springbootinstance.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
