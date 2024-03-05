package com.hypertek.repository;

import java.util.List;

public interface CrudRepository <T,ID>{

    T save(T t);
    T findById(ID Id);
    List<T> findAll();
    void deleteById(ID id);
}
