package com.hypertek.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CrudRepository <T,ID>{

    T save(T t);
    T findById(ID Id);
    T updateById(ID id);
    List<T> findAll();
    void delete(T t);
    void deleteById(ID id);
}
