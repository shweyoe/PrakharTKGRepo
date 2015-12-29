package com.yash.projectsearchejbapplication.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.projectsearchejbapplication.pojo.Product;
import com.yash.projectsearchejbapplication.service.ProductServiceLocal;

@ManagedBean
@SessionScoped
public class ProductBean {
	
	@EJB ProductServiceLocal productService;
	
	private Product product = new Product();
	List<Product> listProduct = new ArrayList<>();
	Set<String> products = new HashSet<>();
	Set<String> vendors = new HashSet<>();
	Set<String> citys = new HashSet<>();
	private List<Product> searchedList;
	
	@PostConstruct
	public void init(){
		listProduct.add(new Product("Mobile" , "LG" , "Indore"));
        listProduct.add(new Product("Mobile" , "APPLE" , "Indore"));
        listProduct.add(new Product("Mobile" , "Samsung" , "Pune"));
        listProduct.add(new Product("Mobile" , "LG" , " Mumbai"));
        
        listProduct.add(new Product("Tv" , "Samsung" , "Indore"));
        listProduct.add(new Product("Tv" , "Samsung" , "Mumbai"));
        listProduct.add(new Product("Tv" , "LG" , "Delhi "));
        listProduct.add(new Product("Tv" , "Micromax" , "Indore"));
        listProduct.add(new Product("Tv" , "Philips" , "Indore"));
        listProduct.add(new Product("Tv" , "LG" , "Indore"));
        
        listProduct.add(new Product("Microwave" , "LG" , "Pune"));
        listProduct.add(new Product("Microwave" , "Philips" , "Indore"));
        listProduct.add(new Product("Microwave" , "Samsung" , "Mumbai"));
        listProduct.add(new Product("Microwave" , "LG" , "Indore"));
        
        for (Product product : listProduct) {
			products.add(product.getProductName());
			citys.add(product.getCity());
			vendors.add(product.getVendor()); 
		}
		
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public Set<String> getProducts() {
		return products;
	}

	public void setProducts(Set<String> products) {
		this.products = products;
	}

	public Set<String> getVendors() {
		return vendors;
	}

	public void setVendors(Set<String> vendors) {
		this.vendors = vendors;
	}

	public Set<String> getCitys() {
		return citys;
	}

	public void setCitys(Set<String> citys) {
		this.citys = citys;
	}

	public String searchProduct(){
		System.out.println(product);
		searchedList=productService.search(product,listProduct);
		System.out.println(searchedList);
		return null;
	}

	public List<Product> getSearchedList() {
		return searchedList;
	}

	public void setSearchedList(List<Product> searchedList) {
		this.searchedList = searchedList;
	}
	
	
	
	
}