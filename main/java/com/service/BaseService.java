package com.service;

import java.util.List;


public interface BaseService<T> {
    /**
     * 根据主键查找
     *
     * @param //t 含有主键值的实体对象
     * @return 实体对象
     */
    public T findById(Long id);

    /**
     * 根据主键查找
     *
     * @param //t 含有主键值的实体对象
     * @return 实体对象
     */
    public T findById(String id);

    /**
     * @param //实体对象
     * @param //翻页参数
     * @return
     */

    /**
     * 查找所有实体
     *
     * @return
     */
    public List<T> findAll();


    /**
     * 根据属性名查找
     *
     * @param propertyName  属性名称
     * @param propertyValue 属性值
     * @return 实体列表
     */
    public List<T> findByProperty(String propertyName, Object propertyValue);


    /**
     * 保存
     *
     * @param t
     */
    public void save(T t);

    /**
     * 修改
     *
     * @param t
     */
    public void saveOrUpdate(T t);


    /**
     * 根据对象删除
     *
     * @param t 实体对象
     */
    public void delete(T t);


}
