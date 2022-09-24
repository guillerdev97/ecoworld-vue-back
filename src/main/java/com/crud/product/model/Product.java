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
    @Column(name = "product_name", nullable = false)
    private String name;
    @Column(name = "product_cost", nullable = false)
    private Float price;
    @Column(name = "product_description", nullable = false)
    private String description;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
