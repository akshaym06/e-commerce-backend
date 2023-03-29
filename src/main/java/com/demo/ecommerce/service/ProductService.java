package com.demo.ecommerce.service;

import com.demo.ecommerce.dao.ProductDao;
import com.demo.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product addNewProduct(@RequestBody Product product) {
        return productDao.save(product);
    }
}
