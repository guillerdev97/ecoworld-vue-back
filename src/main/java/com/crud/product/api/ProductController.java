package com.crud.product.api;

import com.crud.product.model.Product;
import com.crud.product.repository.ProductRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product findProduct(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    @PostMapping("/products/create")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public Product deleteProductById(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
        productRepository.deleteById(id);
        return product;
    }

    @PutMapping("/products/edit")
    public Product updateProductById(@RequestBody Product product) {
        productRepository.findById(product.getId()).orElseThrow(ProductNotFoundException::new);
        return productRepository.save(product);
    }
}
