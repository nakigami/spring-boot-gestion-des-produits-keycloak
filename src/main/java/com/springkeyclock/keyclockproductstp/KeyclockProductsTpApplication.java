package com.springkeyclock.keyclockproductstp;

import com.springkeyclock.keyclockproductstp.dao.Product;
import com.springkeyclock.keyclockproductstp.dao.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeyclockProductsTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyclockProductsTpApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args ->  {
            productRepository.save(new Product(null, 1800, "Mac book pro 2018"));
            productRepository.save(new Product(null, 2500, "Azuz Gamer Razer 2021"));
            productRepository.save(new Product(null, 350, "Imprimante HP 2020"));
            productRepository.findAll().forEach(p -> {
                System.out.println("Product name : " + p.getName());
                System.out.println("Product price : " + p.getPrice());
                System.out.println("-------------------------");
            });
        };
    }

}
