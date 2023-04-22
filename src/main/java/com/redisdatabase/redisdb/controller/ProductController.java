package com.redisdatabase.redisdb.controller;

import com.redisdatabase.redisdb.model.Product;
import com.redisdatabase.redisdb.repository.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productDao.save(product);
    }
@GetMapping
    public List<Product> findAllProduct(@PathVariable int id){
        return productDao.findAll();
    }
    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id){
        return productDao.findById(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return productDao.delete(id);
    }

}
