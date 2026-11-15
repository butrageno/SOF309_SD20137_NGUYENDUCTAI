package com.poly.phonestore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poly.phonestore.entity.Product;
import com.poly.phonestore.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Lấy danh sách sản phẩm
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Tìm sản phẩm theo ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Thêm sản phẩm
    public Product addProduct(Product product) {
        product.setId(null);
        return productRepository.save(product);
    }

    // Cập nhật sản phẩm
    public Product updateProduct(Long id, Product product) {
        Product existing = productRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Không tìm thấy sản phẩm ID: " + id));

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setImage(product.getImage());
        existing.setDescription(product.getDescription());
        existing.setCategory(product.getCategory());
        existing.setQuantity(product.getQuantity());

        return productRepository.save(existing);
    }

    // Xóa sản phẩm
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Không tìm thấy sản phẩm ID: " + id);
        }

        productRepository.deleteById(id);
    }
}
