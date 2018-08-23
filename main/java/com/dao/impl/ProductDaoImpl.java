package com.dao.impl;

import com.dao.ProductDao;
import com.model.Product;
import org.springframework.stereotype.Repository;

@Repository("ProductDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

}
