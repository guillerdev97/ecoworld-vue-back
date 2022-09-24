package com.crud.product.api;

import com.crud.product.model.Product;
import com.crud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>>  listAll() {
        return ResponseEntity.ok().body(productService.listAll());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.findProduct(id));
    }

    @DeleteMapping("/product/delete/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.delete(id));
    }

    @PostMapping("/products/create")
    public ResponseEntity<?> create(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.create(product));
    }

    @PutMapping("/products/edit")
    public ResponseEntity<Product> updateProductById(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.update(product));
    }
}
