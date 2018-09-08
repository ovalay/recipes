package com.sloant.recipefinder.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepository<T> {

    void create(T objToStore);
    T read(String id);
    void update(T objToUpdate);
    void delete(String id);

}
