package com.poly.phonestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poly.phonestore.entity.Product;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

}