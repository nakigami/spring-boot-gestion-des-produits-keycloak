package com.springkeyclock.keyclockproductstp.web;

import com.springkeyclock.keyclockproductstp.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/products")
    public String getProducts(Model model)
    {
        model.addAttribute("products", this.productRepository.findAll());

        return "products";
    }
}
