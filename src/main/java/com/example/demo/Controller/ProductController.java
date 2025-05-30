package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Repo.ProductRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductRepo productRepo;


  @PostMapping("/insert")
    public String insertUser(@RequestBody Product product){
        Product pro = new Product();
        pro.setName(product.getName());
        pro.setPrice(product.getPrice());
        pro.setOfferprice(product.getOfferprice());
        pro.setImage(product.getImage());
        pro.setCategory(product.getCategory());
        productRepo.saveAndFlush(pro);
        return "User Created SuccessFully";
    }

@GetMapping("/get")
public List<Product> getAll() {
    return productRepo.findAll();
}

  
}
