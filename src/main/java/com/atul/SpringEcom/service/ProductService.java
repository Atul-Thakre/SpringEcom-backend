package com.atul.SpringEcom.service;

import com.atul.SpringEcom.model.Product;
import com.atul.SpringEcom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product>getAllProducts(){
     return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(new Product(-1));
    }
}
