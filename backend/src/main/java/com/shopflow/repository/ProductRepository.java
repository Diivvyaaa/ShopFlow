
// ProductRepository.java
package com.shopflow.repository;
import com.shopflow.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {}

