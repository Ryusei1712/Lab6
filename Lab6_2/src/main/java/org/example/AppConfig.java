package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Product product1() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product A");
        product.setPrice(10.0);
        product.setDescription("Description for Product A");
        return product;
    }

    @Bean
    public Product product2() {
        return new Product(2, "Product B", 20.0, "Description for Product B");
    }

    @Bean
    @Scope("singleton")
    public Product product3() {
        Product product = new Product();
        product.setId(3);
        product.setName("Product C");
        product.setPrice(30.0);
        product.setDescription("Description for Product C");
        return product;
    }
}

