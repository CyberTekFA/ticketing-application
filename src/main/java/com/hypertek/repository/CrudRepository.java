package com.hypertek.repository;

import com.hypertek.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CrudRepository <T,ID>{

    T save(T t);
    T findById(ID Id);
    List<T> findAll();
    void deleteById(ID id);
    void update(T object);

}
