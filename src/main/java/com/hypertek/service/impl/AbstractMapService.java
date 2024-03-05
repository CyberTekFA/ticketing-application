package com.hypertek.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<ID,T> {
    protected Map<ID,T> map = new HashMap<>();

    T save(ID id,T t){
        map.put(id,t);
        return t;
    }
    List<T> findAll(){
        return new ArrayList<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    void deleteById(ID id){
        map.remove(id);
    }
}
