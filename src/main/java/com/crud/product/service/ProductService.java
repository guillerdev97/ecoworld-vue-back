package com.crud.product.service;

import com.crud.product.api.ProductNotFoundException;
import com.crud.product.model.Product;
import com.crud.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product findProduct(Long id) {
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    public Long delete(Long id) {
        if(productRepository.findById(id).isEmpty()) {
            throw new ProductNotFoundException();
        }

        productRepository.deleteById(id);
        return id;
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Product product) {
        if(productRepository.findById(product.getId()).isEmpty()) {
            throw new ProductNotFoundException();
        }

        return productRepository.save(product);
    }
}
