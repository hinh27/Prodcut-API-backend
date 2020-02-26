package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
    Iterable<Product> findAllByNameContains(String name);
}
