package com.example.demo2.controller;

import com.example.demo2.model.Product;
import com.example.demo2.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService iproductService;

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Product>>getAll(){
        Iterable<Product> products =iproductService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
