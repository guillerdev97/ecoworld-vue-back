package com.crud.product.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_img", nullable = false)
    private String img;
    @Column(name = "product_name", nullable = false)
    private String name;
    @Column(name = "product_category", nullable = false)
    private String category;
    @Column(name = "product_cost", nullable = false)
    private Float price;
    @Column(name = "product_description", nullable = false)
    private String description;
}
