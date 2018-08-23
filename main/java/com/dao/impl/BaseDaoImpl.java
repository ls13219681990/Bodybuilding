package com.dao.impl;

import com.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {


    private Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        Class<T> myClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.persistentClass = myClass;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }


    @Autowired
    protected void initSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    /**
     * 带有分页查询以及排序功能的条件查询
     */

    @SuppressWarnings("unchecked")


    public void delete(T t) {
        logger.debug("deleting  " + t.getClass().getSimpleName() + "  instance");
        try {
            getHibernateTemplate().delete(t);
            logger.debug("delete successful");
        } catch (RuntimeException re) {
            logger.error("delete failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        logger.debug("finding all " + persistentClass.getSimpleName() + " instances");
        try {
            String queryString = "from " + persistentClass.getSimpleName();
            return (List<T>) getHibernateTemplate().find(queryString);
        } catch (RuntimeException re) {
            logger.error("find all failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findByExample(T t) {
        logger.debug("finding " + persistentClass.getSimpleName() + " instance by example");
        try {
            List<T> results = getHibernateTemplate().findByExample(t);
            logger.debug("find by example successful, result size: "
                    + results.size());
            return results;
        } catch (RuntimeException re) {
            logger.error("find by example failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public T findById(Long id) {
        logger.debug("getting " + persistentClass.getSimpleName() + " instance with id: " + id);
        try {
            T instance = (T) getHibernateTemplate()
                    .get(getPersistentClass(), id);
            return instance;
        } catch (RuntimeException re) {
            logger.error("get failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public T findById(String id) {
        logger.debug("getting " + persistentClass.getSimpleName() + " instance with id: " + id);
        try {
            T instance = (T) getHibernateTemplate()
                    .get(getPersistentClass(), id);
            return instance;
        } catch (RuntimeException re) {
            logger.error("get failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findByProperty(String propertyName, Object value) {
        logger.debug("finding " + persistentClass.getSimpleName() + " instance with property: "
                + propertyName + ", value: " + value);
        try {
            String queryString = "from " + persistentClass.getSimpleName() + " as model where model."
                    + propertyName + "= ?";
            return (List<T>) getHibernateTemplate().find(queryString, value);
        } catch (RuntimeException re) {
            logger.error("find by property name failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> findByProperty(String propertyName, Object value, String orderName) {
        logger.debug("finding " + persistentClass.getSimpleName() + " instance with property: "
                + propertyName + ", value: " + value + " order by " + orderName);
        try {
            String queryString = "from " + persistentClass.getSimpleName() + " as model where model."
                    + propertyName + "= ?" + " order by " + orderName;
            return (List<T>) getHibernateTemplate().find(queryString, value);
        } catch (RuntimeException re) {
            logger.error("find by property name failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    public T merge(T t) {
        logger.debug("merging " + persistentClass.getSimpleName() + " instance");
        try {
            T result = (T) getHibernateTemplate().merge(t);
            logger.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            logger.error("merge failed", re);
            throw re;
        }
    }

    public void save(T t) {
        logger.debug("saving " + persistentClass.getSimpleName() + " instance");
        try {
            getHibernateTemplate().save(t);
            logger.debug("save successful");
        } catch (RuntimeException re) {
            logger.error("save failed", re);
            throw re;
        }
    }

    public void saveOrUpdate(T t) {
        logger.debug("saveOrUpdate " + t.getClass().getSimpleName() + " instance");
        try {
            getHibernateTemplate().saveOrUpdate(t);
            logger.debug("saveOrUpdate successful");
        } catch (RuntimeException re) {
            logger.error("saveOrUpdate failed", re);
            throw re;
        }
    }

    public void update(T t) {
        logger.debug("update " + t.getClass().getSimpleName() + " update");
        try {
            getHibernateTemplate().update(t);
            logger.debug("update successful");
        } catch (RuntimeException re) {
            logger.error("update failed", re);
            re.printStackTrace();
            throw re;
        }
    }

}
