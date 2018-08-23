package com.service.impl;

import com.model.Product;
import com.service.ProductService;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {
}
