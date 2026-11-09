
package com.poly.phonestore.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    // Khóa chính
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Tên sản phẩm
    @Column(nullable = false, length = 255)
    private String name;

    // Giá sản phẩm
    @Column(nullable = false, precision = 18, scale = 2)
    private BigDecimal price;

    // Hình ảnh sản phẩm
    @Column(length = 500)
    private String image;

    // Mô tả sản phẩm
    @Lob
    private String description;

    // Danh mục
    @Column(length = 100)
    private String category;

    // Số lượng tồn kho
    private Integer quantity;

    // Constructor mặc định
    public Product() {
    }

    // Getter và Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
