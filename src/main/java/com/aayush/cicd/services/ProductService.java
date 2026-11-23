package com.aayush.cicd.services;

import com.aayush.cicd.models.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {

        return List.of(
                new Product(101, "Laptop", 55000, "Electronics"),
                new Product(102, "Smartphone", 25000, "Electronics"),
                new Product(103, "Headphones", 1500, "Accessories"),
                new Product(104, "Keyboard", 1200, "Accessories"),
                new Product(105, "Mouse", 700, "Accessories")
        );
    }
}
