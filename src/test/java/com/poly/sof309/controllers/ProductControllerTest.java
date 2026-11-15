package com.poly.sof309.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.ui.Model;
import org.springframework.web.server.ResponseStatusException;

import com.poly.phonestore.controller.ProductController;
import com.poly.phonestore.entity.Product;
import com.poly.phonestore.service.ProductService;

class ProductControllerTest {

    private ProductService productService;
    private ProductController productController;
    private Model model;

    @BeforeEach
    void setUp() {
        productService = mock(ProductService.class);
        productController = new ProductController(productService);
        model = mock(Model.class);
    }

    // TEST 1: Hiển thị danh sách sản phẩm
    @Test
    void testListProducts() {
        when(productService.getAllProducts())
                .thenReturn(Arrays.asList(new Product(), new Product()));

        String view = productController.listProducts(model);

        assertEquals("admin/products", view);
        verify(model).addAttribute(eq("products"), anyList());
    }

    // TEST 2: Hiển thị form thêm sản phẩm
    @Test
    void testShowAddForm() {
        String view = productController.showAddForm(model);

        assertEquals("admin/product-form", view);
        verify(model).addAttribute(eq("product"), any(Product.class));
    }

    // TEST 3: Thêm sản phẩm
    @Test
    void testAddProduct() {
        Product product = new Product();
        product.setName("iPhone 16 Pro Max");
        product.setPrice(new BigDecimal("29990000"));

        String view = productController.addProduct(product);

        assertEquals("redirect:/admin/products", view);
        verify(productService).addProduct(product);
    }

    // TEST 4: Hiển thị form sửa sản phẩm
    @Test
    void testShowEditForm() {
        Product product = new Product();
        product.setId(1L);

        when(productService.getProductById(1L))
                .thenReturn(Optional.of(product));

        String view = productController.showEditForm(1L, model);

        assertEquals("admin/product-form", view);
        verify(model).addAttribute("product", product);
    }

    // TEST 5: Không tìm thấy sản phẩm khi sửa
    @Test
    void testShowEditFormNotFound() {
        when(productService.getProductById(99L))
                .thenReturn(Optional.empty());

        assertThrows(ResponseStatusException.class,
                () -> productController.showEditForm(99L, model));
    }

    // TEST 6: Cập nhật sản phẩm
    @Test
    void testUpdateProduct() {
        Product product = new Product();
        product.setName("Samsung Galaxy S25");

        String view = productController.updateProduct(2L, product);

        assertEquals("redirect:/admin/products", view);
        verify(productService).updateProduct(2L, product);
    }

    // TEST 7: Xóa sản phẩm
    @Test
    void testDeleteProduct() {
        String view = productController.deleteProduct(1L);

        assertEquals("redirect:/admin/products", view);
        verify(productService).deleteProduct(1L);
    }

    // TEST 8: Kiểm thử nhiều tên sản phẩm bằng CsvSource
    @ParameterizedTest
    @CsvSource({
        "iPhone 16 Pro Max",
        "Samsung Galaxy S25",
        "Xiaomi 15"
    })
    void testProductName(String name) {
        Product product = new Product();
        product.setName(name);

        assertEquals(name, product.getName());
    }
}
