package com.amit.technology.web.springbootinstance.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.amit.technology.web.springbootinstance.constants.ProductCategory;

@Entity
public class Product {

	@Id
	private Long productId;

	private String productName;
	private String productDescription;
	private ProductCategory productCategory;

	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
}
