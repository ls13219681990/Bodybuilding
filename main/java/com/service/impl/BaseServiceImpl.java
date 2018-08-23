package com.service.impl;

import com.dao.BaseDao;
import com.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    @Override
    public T findById(Long id) {
        return baseDao.findById(id);
    }

    @Override
    public T findById(String id) {
        return baseDao.findById(id);
    }

    @Override
    public List<T> findAll() {
        return baseDao.findAll();
    }

    @Override
    public List<T> findByProperty(String propertyName, Object propertyValue) {
        return baseDao.findByProperty(propertyName, propertyValue);
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void saveOrUpdate(T t) {

    }

    @Override
    public void delete(T t) {

    }
}
